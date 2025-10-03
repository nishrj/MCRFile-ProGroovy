tumor.abstractedBy = 'TX'
tumor.accessionNumberHosp = tumor.dateOf1stContactYear
tumor.patientSystemIdHosp = null
naaccrData.npiRegistryId = null
tumor.npiReportingFacility = null
if (patient.spanishHispanicOrigin == null)
    patient.spanishHispanicOrigin = '9'
if (patient.socialSecurityNumber == null)
    patient.socialSecurityNumber = '999999999'
if (patient.birthplaceState == null)
    patient.birthplaceState = 'ZZ'
if (patient.birthplaceCountry == null)
    patient.birthplaceCountry = 'ZZU'
if (tumor.textUsualOccupation == null)
    tumor.textUsualOccupation = 'TEXT NOT TRANSMITTED'
if (tumor.textUsualIndustry == null)
    tumor.textUsualIndustry = 'TEXT NOT TRANSMITTED'
if (['2','3'].contains(tumor.behaviorCodeIcdO3))
    tumor.sequenceNumberHospital = '00'
if (['0','1'].contains(tumor.behaviorCodeIcdO3))
    tumor.sequenceNumberHospital = '60'
tumor.classOfCase = '99'
if (tumor.dateOfDiagnosisYear <= '2017'
  &&  tumor.seerSummaryStage2000 == null
  && ['0','1'].contains(tumor.behaviorCodeIcdO3))
    tumor.seerSummaryStage2000 = '8'
if (tumor.dateOfDiagnosisYear <= '2017'
  && tumor.seerSummaryStage2000 == null
  && tumor.behaviorCodeIcdO3 == '2')
    tumor.seerSummaryStage2000 = '0'
if (tumor.dateOfDiagnosisYear <= '2017'
  && tumor.seerSummaryStage2000 == null
  && tumor.behaviorCodeIcdO3 == '3')
    tumor.seerSummaryStage2000 = '9'
if (tumor.dateOfDiagnosisYear >= '2018'
  && tumor.summaryStage2018 == null
  && ['0','1'].contains(tumor.behaviorCodeIcdO3))
    tumor.summaryStage2018 = '8'
if (tumor.dateOfDiagnosisYear >= '2018'
  && tumor.summaryStage2018 == null
  && tumor.behaviorCodeIcdO3 == '2')
    tumor.summaryStage2018 = '0'
if (tumor.dateOfDiagnosisYear >= '2018'
  && tumor.summaryStage2018 == null
  && tumor.behaviorCodeIcdO3 == '3')
    tumor.summaryStage2018 = '9'
if (patient.vitalStatus == '0')
    patient.placeOfDeathState = 'ZZ'
if (patient.vitalStatus != '0')
    patient.placeOfDeathState = null
if (patient.vitalStatus == '0')
    patient.placeOfDeathCountry = 'ZZU'
if (patient.vitalStatus != '0')
    patient.placeOfDeathCountry = null
tumor.medicalRecordNumber = '000000000000000'
if (['20','21','22'].contains(tumor.classOfCase))
    tumor.institutionReferredFrom = '0000000000'
if (!['20','21','22'].contains(tumor.classOfCase))
    tumor.institutionReferredFrom = '9999999999'
tumor.npiInstReferredFrom = null
if (['00','10','11','12','13','14'].contains(tumor.classOfCase))
    tumor.institutionReferredTo = '0000000000'
if (!['00','10','11','12','13','14'].contains(tumor.classOfCase))
    tumor.institutionReferredTo = '9999999999'
tumor.npiInstReferredTo = null
tumor.followingRegistry = null
tumor.npiFollowingRegistry = null
tumor.physicianManaging = null
tumor.npiPhysicianManaging = null
tumor.physicianFollowUp = null
tumor.npiPhysicianFollowUp = null
tumor.physicianPrimarySurg = null
tumor.npiPhysicianPrimarySurg = null
if (tumor.textDxProcPath == null)
    tumor.textDxProcPath = 'TEXT NOT TRANSMITTED '
if (tumor.textPrimarySiteTitle == null)
    tumor.textPrimarySiteTitle = 'TEXT NOT TRANSMITTED '
if (tumor.textHistologyTitle == null) 
    tumor.textHistologyTitle = 'TEXT NOT TRANSMITTED '
if (tumor.rxTextSurgery == null)
    tumor.rxTextSurgery = 'TEXT NOT TRANSMITTED '
if (tumor.rxTextRadiation == null)
    tumor.rxTextRadiation = 'TEXT NOT TRANSMITTED '
if (tumor.rxTextRadiationOther == null) 
    tumor.rxTextRadiationOther = 'TEXT NOT TRANSMITTED '
if (tumor.rxTextChemo == null) 
    tumor.rxTextChemo = 'TEXT NOT TRANSMITTED '
if (tumor.rxTextHormone == null)
    tumor.rxTextHormone = 'TEXT NOT TRANSMITTED '
if (tumor.rxTextBrm == null)
    tumor.rxTextBrm = 'TEXT NOT TRANSMITTED '
if (tumor.dateOfDiagnosisYear >= '2016'
  && tumor.dateOfDiagnosisMonth >= '01'
  && tumor.dateOfDiagnosisDay >= '01')
    tumor.csTumorSize = null
if (tumor.dateOfDiagnosisYear >= '2016'
  && tumor.dateOfDiagnosisMonth >= '01'
  && tumor.dateOfDiagnosisDay >= '01')
    tumor.csExtension = null
if (tumor.dateOfDiagnosisYear >= '2016'
  && tumor.dateOfDiagnosisMonth >= '01'
  && tumor.dateOfDiagnosisDay >= '01')
    tumor.csTumorSizeExtEval = null
if (tumor.dateOfDiagnosisYear >= '2016'
  && tumor.dateOfDiagnosisMonth >= '01'
  && tumor.dateOfDiagnosisDay >= '01')
    tumor.csLymphNodes = null
if (tumor.dateOfDiagnosisYear >= '2016'
  && tumor.dateOfDiagnosisMonth >= '01'
  && tumor.dateOfDiagnosisDay == '01')
    tumor.csLymphNodesEval = null
if (tumor.dateOfDiagnosisYear >= '2016'
  && tumor.dateOfDiagnosisMonth >= '01'
  && tumor.dateOfDiagnosisDay >= '01')
    tumor.csMetsAtDx = null
if (tumor.dateOfDiagnosisYear >= '2016'
  && tumor.dateOfDiagnosisMonth >= '01'
  && tumor.dateOfDiagnosisDay >= '01')
    tumor.csMetsAtDxBone = null
if (tumor.dateOfDiagnosisYear >= '2016'
  && tumor.dateOfDiagnosisMonth >= '01'
  && tumor.dateOfDiagnosisDay >= '01')
    tumor.csMetsAtDxBrain = null
if (tumor.dateOfDiagnosisYear >= '2016'
  && tumor.dateOfDiagnosisMonth >= '01'
  && tumor.dateOfDiagnosisDay >= '01')
    tumor.csMetsAtDxLiver = null
if (tumor.dateOfDiagnosisYear >= '2016'
  && tumor.dateOfDiagnosisMonth >= '01'
  && tumor.dateOfDiagnosisDay >= '01')
    tumor.csMetsAtDxLung = null
if (tumor.dateOfDiagnosisYear >= '2016'
  && tumor.dateOfDiagnosisMonth >= '01'
  && tumor.dateOfDiagnosisDay >= '01')
    tumor.csMetsEval = null
tumor.npiArchiveFin = null
tumor.archiveFin = null
tumor.rxSummPalliativeProc = '9'
if (tumor.cancerStatus == null)
    tumor.cancerStatus = '9'
if (tumor.rxCodingSystemCurrent == null)
    tumor.rxCodingSystemCurrent = '08'
patient.moTobaccoHistory = '9'
patient.moTobaccoYears = '99'
patient.moAlcoholHistory = '9'
if (tumor.addrAtDxCity == null)
    tumor.addrAtDxCity = 'UNKNOWN'
if (tumor.addrAtDxNoStreet == null)
    tumor.addrAtDxNoStreet = 'UNKNOWN'
if (tumor.addrAtDxPostalCode == null)
    tumor.addrAtDxPostalCode = '99999'
if (tumor.addrAtDxState == null)
    tumor.addrAtDxState = 'ZZ'
if (patient.addrCurrentNoStreet == null)
    patient.addrCurrentNoStreet = 'UNKNOWN'
if (patient.addrCurrentCity == null)
    patient.addrCurrentCity = 'UNKNOWN'
if (patient.addrCurrentPostalCode == null)
    patient.addrCurrentPostalCode = '99999'
if (patient.addrCurrentState == null)
    patient.addrCurrentState = 'ZZ'
if (patient.vitalStatus == '1')
    patient.causeOfDeath = '0000'
if (patient.vitalStatus == '0')
    patient.causeOfDeath = '7777'
if (tumor.cocAccreditedFlag >= '1')
    tumor.cocAccreditedFlag = '0'
if (tumor.countyAtDx == null)
    tumor.countyAtDx = '998'
if (patient.addrCurrentCountry == null)
    patient.addrCurrentCountry = '998'
if (tumor.dateOfDiagnosisYear >= '2018')
    tumor.rxSummRadiation = null
if (tumor.rxTextOther == null)
    tumor.rxTextOther = 'TEXT NOT TRANSMITTED'
if (tumor.dateOfDiagnosisYear >= '2018')
    tumor.seerSummaryStage2000 = null
if (tumor.dateOfDiagnosisYear <= '2017')
    tumor.summaryStage2018 = null
if (tumor.dateOfDiagnosisYear >= '2018')
    tumor.seerSummaryStage2000 = null
tumor.npiPhysician3 = null
tumor.npiPhysician4 = null
tumor.physician3 = null
tumor.physician4 = null
tumor.pathOrderPhysLicNo1 = null
tumor.pathOrderPhysLicNo2 = null
tumor.pathOrderPhysLicNo3 = null
tumor.pathOrderPhysLicNo4 = null
tumor.pathOrderPhysLicNo5 = null
tumor.pathOrderingFacNo1 = null
tumor.pathOrderingFacNo2 = null
tumor.pathOrderingFacNo3 = null
tumor.pathOrderingFacNo4 = null
tumor.pathOrderingFacNo5 = null
tumor.pathReportingFacId1 = null
tumor.pathReportingFacId2 = null
tumor.pathReportingFacId3 = null
tumor.pathReportingFacId4 = null
tumor.pathReportingFacId5 = null
if (patient.vitalStatus == '1')
    patient.icdRevisionNumber = '0'
if (tumor.morphCodingSysCurrent == null)
    tumor.morphCodingSysCurrent = 'E'
tumor.siteCodingSysCurrent = '5'

