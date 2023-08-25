create table Test_RegisterOfDistricts (
	registerOfDistrictsId LONG not null primary key,
	name VARCHAR(75) null,
	districtCode LONG,
	isArchived BOOLEAN
);

create table Test_RegisterOfFarmers (
	registerOfFarmersId LONG not null primary key,
	organizationName VARCHAR(75) null,
	legalForm VARCHAR(75) null,
	inn VARCHAR(75) null,
	kpp VARCHAR(75) null,
	ogrn VARCHAR(75) null,
	registrationArea VARCHAR(75) null,
	cropAreas VARCHAR(75) null,
	dateOfRegistration DATE null,
	isArchived BOOLEAN
);