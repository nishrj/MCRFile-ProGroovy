if (patient.countyCurrent == null)
    patient.countyCurrent = tumor.countyAtDx
if (patient.addrCurrentState != 'MO')
    patient.countyCurrent = '998'
if (tumor.addrAtDxState != 'MO')
    tumor.countyAtDx = '998'
