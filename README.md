What the current Groovy scripts do
1) OOS24.groovy — Out-of-State (OOS) intake normalizer

Purpose: Make heterogeneous OOS abstracts acceptable for downstream tools (PrepPlus/File*Pro extracts, QA), by defaulting missing values, flipping legacy fields, and aligning staging by DX year.

Key operations (high level):

Identity/flags: sets tumor.abstractedBy='TX', clears several NPIs (npi* fields), resets MRN to a placeholder, sets classOfCase='99' as a safe default for unknown OOS context.

Unknown/value defaults (NAACCR-conformant “unknowns”):

Hispanic origin, SSN, birthplace (state/country), multiple text narratives → “TEXT NOT TRANSMITTED”.

Addresses/postal codes/states → “UNKNOWN”, 99999, ZZ.

County/Current Country unknowns → 998.

Tobacco/Alcohol custom MO items to unknowns (9/99).

Hospital sequence rules by behavior:

Behavior 2/3 → sequenceNumberHospital='00' (malignant/in situ handled as first at facility).

Behavior 0/1 → sequenceNumberHospital='60'.

Staging logic by diagnosis year (mutually exclusive guards):

≤2017: populate SEER Summary Stage 2000, blank SS2018.

≥2018: populate Summary Stage 2018, blank SS2000.

Behavior-based unknown defaults: in situ vs malignant (0/8/9 patterns).

CS (Collaborative Stage) deprecation cleanup: for DX ≥2016, blank CS size/extension/nodes/mets and eval fields.

Referral/institution routing placeholders: set referred-from/to IDs and NPIs to “all zeros” vs “all nines” depending on class of case.

Death info: If alive (vitalStatus='1') set causeOfDeath='0000'; if deceased: place of death state/country → ZZ/ZZU, causeOfDeath='7777'.

Coding systems defaults: rxCodingSystemCurrent='08', morphCodingSysCurrent='E', siteCodingSysCurrent='5'.

Net effect: Converts variable OOS inputs into registry-safe, edit-tolerant records with consistent unknown codes, suppresses obsolete CS items for modern DX years, and ensures a viable stage representation.

2) county-fix.groovy — County harmonization

Purpose: Keep county values consistent with “in-state only” policy.

If patient’s current state ≠ MO ⇒ patient.countyCurrent='998'.

If addrAtDxState ≠ MO ⇒ tumor.countyAtDx='998'.

If patient.countyCurrent is null ⇒ copy tumor.countyAtDx.
