class States{
public static String[] getStateNames(String country){
System.out.println("Invoked getStateNames...");
if(country != null){
if(country == "India"){
String[] statesOfInida = {"Uttar Pradesh","Maharashtra","Bihar","West Bengal","Madhya Pradesh","Tamil Nadu","Rajasthan","Karnataka","Gujarat","Andhra Pradesh","Odisha","Telangana","Kerala","Jharkhand","Assam","Punjab","Chhattisgarh","Haryana","Delhi","Jammu and Kashmir",
"Uttarakhand","Himachal Pradesh","Tripura","Meghalaya","Manipur","Nagaland","Goa","Arunachal Pradesh","Mizoram","Sikkim"};
return statesOfInida;}

else if(country == "China"){
String[] statesOfChina = {"Guangdong","Shandong","Henan","Sichuan","Jiangsu","Hebei","Hunan","Anhui","Hubei","Zhejiang",
"Guangxi","Yunnan","Jiangxi","Liaoning","Fujian","Shaanxi","Heilongjiang","Shanxi","Guizhou","Chongqing",
"Gansu","Inner Mongolia","Xinjiang","Tianjin","Shanghai","Beijing","Qinghai","Ningxia","Hainan","Tibet"
};
return statesOfChina;}

else if(country == "United States"){
String[] statesOfUnitedStates = {"California","Texas","Florida","New York","Pennsylvania","Illinois","Ohio","Georgia","North Carolina","Michigan",
"New Jersey","Virginia","Washington","Arizona","Massachusetts","Tennessee","Indiana","Missouri","Maryland","Wisconsin",
"Colorado","Minnesota","South Carolina","Alabama","Louisiana","Kentucky","Oregon","Oklahoma","Connecticut","Utah",
"Iowa","Nevada","Arkansas","Mississippi","Kansas","New Mexico","Nebraska","Idaho","West Virginia","Hawaii",
"New Hampshire","Maine","Montana","Rhode Island","Delaware","South Dakota","North Dakota","Alaska","Vermont","Wyoming"
};
return statesOfUnitedStates;}

else if(country == "Indonesia"){
String[] statesOfIndonesia = {"West Java","East Java","Central Java","North Sumatra","Banten","Jakarta","South Sulawesi","Lampung","South Sumatra","Riau",
"West Sumatra","Bali","East Kalimantan","West Kalimantan","Central Kalimantan","Papua","Aceh","Yogyakarta","West Papua","North Sulawesi"
};
return statesOfIndonesia;}

else if(country == "Pakistan"){
String[] statesOfPakistan = {"Punjab","Sindh","Khyber Pakhtunkhwa","Balochistan","Islamabad Capital Territory","Gilgit-Baltistan","Azad Kashmir"
};
return statesOfPakistan;}

else if(country == "Nigeria"){
String[] statesOfNigeria = {"Lagos","Kano","Kaduna","Rivers","Oyo","Katsina","Anambra","Delta","Bauchi","Borno",
"Benue","Plateau","Sokoto","Kebbi","Imo","Ondo","Osun","Enugu","Edo","Akwa Ibom"
};
return statesOfNigeria;}

else if(country == "Brazil"){
String[] statesOfBrazil = {"Sao Paulo","Minas Gerais","Rio de Janeiro","Bahia","Parana","Rio Grande do Sul","Pernambuco","Ceara","Para","Santa Catarina",
"Maranhao","Goias","Amazonas","Paraiba","Espirito Santo","Rio Grande do Norte","Mato Grosso","Alagoas","Piaui","Distrito Federal"
};
return statesOfBrazil;}

else if(country == "Bangladesh"){
String[] statesOfBangladesh = {"Dhaka","Chittagong","Rajshahi","Khulna","Barisal","Sylhet","Rangpur","Mymensingh"
};
return statesOfBangladesh;}

else if(country == "Russia"){
String[] statesOfRussia = {"Moscow","Moscow Oblast","Saint Petersburg","Krasnodar","Sverdlovsk","Tatarstan","Bashkortostan","Rostov",
"Chelyabinsk","Samara","Nizhny Novgorod","Novosibirsk","Krasnoyarsk","Perm","Voronezh"
};
return statesOfRussia;}

else if(country == "Mexico"){
String[] statesOfMexico = {"Mexico State","Mexico City","Jalisco","Veracruz","Puebla","Guanajuato","Chiapas","Nuevo Leon",
"Michoacan","Oaxaca","Chihuahua","Guerrero","Tamaulipas","Baja California","Sinaloa"
};
return statesOfMexico;}

else if(country == "Ethiopia"){
String[] statesOfEthiopia = {"Oromia","Amhara","Somali","Tigray","Afar","Benishangul-Gumuz","Gambela","Harari","Sidama","Addis Ababa"
};
return statesOfEthiopia;}

else if(country == "Philippines"){
String[] statesOfPhilippines = {"Calabarzon","Central Luzon","Metro Manila","Central Visayas","Western Visayas",
"Bicol","Ilocos","Davao","Cagayan Valley","Northern Mindanao"
};
return statesOfPhilippines;}

else if(country == "Egypt"){
String[] statesOfEgypt = {"Cairo","Giza","Alexandria","Dakahlia","Sharqia","Beheira","Gharbia","Minya","Qalyubia","Sohag"
};
return statesOfEgypt;}

else if(country == "Vietnam"){
String[] statesOfVietnam = {"Hanoi","Ho Chi Minh City","Thanh Hoa","Nghe An","Dong Nai","Hai Phong","Can Tho","Quang Ninh","Hue","Da Nang"
};
return statesOfVietnam;}

else if(country == "DR Congo"){
String[] statesOfDRCongo = {"Kinshasa","Kongo Central","North Kivu","South Kivu","Katanga","Ituri","Kasai","Kasai Central","Equateur","Maniema"
};
return statesOfDRCongo;}

else if(country == "Turkey"){
String[] statesOfTurkey = {"Istanbul","Ankara","Izmir","Bursa","Antalya","Adana","Konya","Gaziantep","Kocaeli","Mersin"
};
return statesOfTurkey;}

else if(country == "Iran"){
String[] statesOfIran = {"Tehran","Isfahan","Fars","Khorasan Razavi","Khuzestan","East Azerbaijan","Mazandaran","Alborz","Qom","Kerman"
};
return statesOfIran;}

else if(country == "Germany"){
String[] statesOfGermany = {"Bavaria","North Rhine-Westphalia","Baden-Wurttemberg","Lower Saxony","Hesse","Saxony","Rhineland-Palatinate",
"Berlin","Hamburg","Brandenburg","Saxony-Anhalt","Thuringia","Schleswig-Holstein","Saarland","Bremen","Mecklenburg-Vorpommern"
};
return statesOfGermany;}

else if(country == "Thailand"){
String[] statesOfThailand = {"Bangkok","Chiang Mai","Chonburi","Nakhon Ratchasima","Khon Kaen","Udon Thani","Songkhla","Nonthaburi","Pathum Thani","Phuket"
};
return statesOfThailand;}

else if(country == "United Kingdom"){
String[] statesOfUnitedKingdom = {"England","Scotland","Wales","Northern Ireland"
};
return statesOfUnitedKingdom;}

else if(country == "France"){
String[] statesOfFrance = {"Ile-de-France","Provence-Alpes-Cote d'Azur","Auvergne-Rhone-Alpes","Nouvelle-Aquitaine","Occitanie",
"Hauts-de-France","Grand Est","Normandy","Brittany","Burgundy-Franche-Comte"
};
return statesOfFrance;}

else if(country == "Italy"){
String[] statesOfItaly = {"Lombardy","Lazio","Campania","Sicily","Veneto","Emilia-Romagna","Piedmont","Tuscany","Apulia","Calabria"
};
return statesOfItaly;}

else if(country == "South Africa"){
String[] statesOfSouthAfrica = {"Gauteng","KwaZulu-Natal","Western Cape","Eastern Cape","Limpopo","Mpumalanga","North West","Free State","Northern Cape"
};
return statesOfSouthAfrica;}

else if(country == "Tanzania"){
String[] statesOfTanzania = {"Dar es Salaam","Mwanza","Arusha","Dodoma","Mbeya","Morogoro","Tanga","Kilimanjaro","Kigoma","Shinyanga"
};
return statesOfTanzania;}

else if(country == "Myanmar"){
String[] statesOfMyanmar = {"Yangon","Mandalay","Shan","Rakhine","Kachin","Kayah","Kayin","Chin","Mon","Sagaing"
};
return statesOfMyanmar;}

else if(country == "South Korea"){
String[] statesOfSouthKorea = {"Seoul","Busan","Incheon","Daegu","Daejeon","Gwangju","Ulsan","Gyeonggi","Gangwon","Jeju"
};
return statesOfSouthKorea;}

else if(country == "Colombia"){
String[] statesOfColombia = {"Bogota","Antioquia","Valle del Cauca","Cundinamarca","Atlantico","Santander","Bolivar","Cordoba","Norte de Santander","Tolima"
};
return statesOfColombia;}

else if(country == "Spain"){
String[] statesOfSpain = {"Andalusia","Catalonia","Madrid","Valencia","Galicia","Castile and Leon","Basque Country","Canary Islands","Murcia","Aragon"
};
return statesOfSpain;}

else if(country == "Argentina"){
String[] statesOfArgentina = {"Buenos Aires","Cordoba","Santa Fe","Mendoza","Tucuman","Entre Rios","Salta","Chaco","Corrientes","Santiago del Estero"
};
return statesOfArgentina;}

else if(country == "Algeria"){
String[] statesOfAlgeria = {"Algiers","Oran","Constantine","Blida","Batna","Setif","Tlemcen","Annaba","Bejaia","Tizi Ouzou"
};
return statesOfAlgeria;}

else if(country == "Sudan"){
String[] statesOfSudan = {"Khartoum","Gezira","North Darfur","South Darfur","West Darfur","Red Sea","White Nile","Blue Nile","Kassala","River Nile"
};
return statesOfSudan;}

else if(country == "Ukraine"){
String[] statesOfUkraine = {"Kyiv","Kharkiv","Dnipropetrovsk","Odessa","Lviv","Zaporizhzhia","Donetsk","Vinnytsia","Poltava","Cherkasy"
};
return statesOfUkraine;}

else if(country == "Iraq"){
String[] statesOfIraq = {"Baghdad","Basra","Nineveh","Erbil","Sulaymaniyah","Diyala","Anbar","Karbala","Najaf","Kirkuk"
};
return statesOfIraq;}

else if(country == "Afghanistan"){
String[] statesOfAfghanistan = {"Kabul","Herat","Kandahar","Balkh","Nangarhar","Kunduz","Helmand","Ghazni","Paktia","Badakhshan"
};
return statesOfAfghanistan;}

else if(country == "Poland"){
String[] statesOfPoland = {"Mazowieckie","Slaskie","Wielkopolskie","Malopolskie","Dolnoslaskie","Lodzkie","Pomorskie","Lubelskie","Podkarpackie","Zachodniopomorskie"
};
return statesOfPoland;}

else if(country == "Canada"){
String[] statesOfCanada = {"Ontario","Quebec","British Columbia","Alberta","Manitoba","Saskatchewan","Nova Scotia","New Brunswick","Newfoundland and Labrador","Prince Edward Island"
};
return statesOfCanada;}

else if(country == "Morocco"){
String[] statesOfMorocco = {"Casablanca-Settat","Rabat-Sale-Kenitra","Fes-Meknes","Marrakesh-Safi","Tanger-Tetouan-Al Hoceima","Souss-Massa","Oriental","Draa-Tafilalet","Beni Mellal-Khenifra","Guelmim-Oued Noun"
};
return statesOfMorocco;}

else if(country == "Saudi Arabia"){
String[] statesOfSaudiArabia = {"Riyadh","Makkah","Eastern Province","Madinah","Asir","Tabuk","Qassim","Hail","Jizan","Najran"
};
return statesOfSaudiArabia;}

else if(country == "Uzbekistan"){
String[] statesOfUzbekistan = {"Tashkent","Samarkand","Fergana","Andijan","Namangan","Bukhara","Khorezm","Kashkadarya","Surkhandarya","Navoi"
};
return statesOfUzbekistan;}

else if(country == "Peru"){
String[] statesOfPeru = {"Lima","Arequipa","La Libertad","Piura","Cusco","Junin","Lambayeque","Ancash","Cajamarca","Puno"
};
return statesOfPeru;}

else if(country == "Malaysia"){
String[] statesOfMalaysia = {"Johor","Selangor","Sabah","Sarawak","Perak","Kedah","Kelantan","Pahang","Penang","Malacca"
};
return statesOfMalaysia;}

else if(country == "Ghana"){
String[] statesOfGhana = {"Greater Accra","Ashanti","Western","Eastern","Central","Northern","Volta","Upper East","Upper West","Bono"
};
return statesOfGhana;}

else if(country == "Nepal"){
String[] statesOfNepal = {"Province No. 1","Madhesh","Bagmati","Gandaki","Lumbini","Karnali","Sudurpashchim"
};
return statesOfNepal;}

else if(country == "Yemen"){
String[] statesOfYemen = {"Sana'a","Aden","Taiz","Hadhramaut","Ibb","Al Hudaydah","Dhamar","Al Mahrah","Marib","Shabwah"
};
return statesOfYemen;}

else if(country == "Venezuela"){
String[] statesOfVenezuela = {"Zulia","Miranda","Carabobo","Lara","Aragua","Bolivar","Anzoategui","Tachira","Sucre","Merida"
};
return statesOfVenezuela;}

else if(country == "Madagascar"){
String[] statesOfMadagascar = {"Antananarivo","Toamasina","Fianarantsoa","Mahajanga","Toliara","Antsiranana"
};
return statesOfMadagascar;}

else if(country == "Cameroon"){
String[] statesOfCameroon = {
"Centre","Littoral","North West","South West","Far North","North","West","South","East","Adamawa"
};
return statesOfCameroon;}

else if(country == "Cote d'Ivoire"){
String[] statesOfCotedIvoire = {
"Lagunes","Comoe","Sassandra-Marahoue","Montagnes","Vallee du Bandama","Woroba","Denguele","Zanzan","Bas-Sassandra","Goh-Djiboua"
};
return statesOfCotedIvoire;}

else if(country == "North Korea"){
String[] statesOfNorthKorea = {
"Pyongyang","North Pyongan","South Pyongan","North Hamgyong","South Hamgyong","Kangwon","Ryanggang","Chagang","North Hwanghae","South Hwanghae"
};
return statesOfNorthKorea;}

else if(country == "Australia"){
String[] statesOfAustralia = {
"New South Wales","Victoria","Queensland","Western Australia","South Australia","Tasmania","Northern Territory","Australian Capital Territory"
};
return statesOfAustralia;}

else if(country == "Niger"){
String[] statesOfNiger = {
"Niamey","Zinder","Maradi","Tahoua","Dosso","Agadez","Tillaberi","Diffa"
};
return statesOfNiger;}

else if(country == "Sri Lanka"){
String[] statesOfSriLanka = {
"Western","Central","Southern","Northern","Eastern","North Western","North Central","Uva","Sabaragamuwa"
};
return statesOfSriLanka;}

else if(country == "Burkina Faso"){
String[] statesOfBurkinaFaso = {
"Centre","Hauts-Bassins","Boucle du Mouhoun","Centre-Est","Centre-Nord","Centre-Ouest","Est","Nord","Sahel","Sud-Ouest"
};
return statesOfBurkinaFaso;}

else if(country == "Mali"){
String[] statesOfMali = {
"Bamako","Kayes","Koulikoro","Sikasso","Segou","Mopti","Tombouctou","Gao","Kidal","Menaka"
};
return statesOfMali;}

else if(country == "Romania"){
String[] statesOfRomania = {
"Bucharest","Cluj","Timis","Iasi","Constanta","Brasov","Prahova","Dolj","Galati","Arges"
};
return statesOfRomania;}

else if(country == "Malawi"){
String[] statesOfMalawi = {
"Central Region","Northern Region","Southern Region"
};
return statesOfMalawi;}

else if(country == "Chile"){
String[] statesOfChile = {
"Santiago Metropolitan","Valparaiso","Biobio","Araucania","Antofagasta","Maule","Los Lagos","Coquimbo","O'Higgins","Atacama"
};
return statesOfChile;}

else if(country == "Kazakhstan"){
String[] statesOfKazakhstan = {
"Almaty","Astana","Shymkent","Karaganda","Aktobe","Turkistan","Atyrau","Kostanay","Pavlodar","Mangystau"
};
return statesOfKazakhstan;}

else if(country == "Zambia"){
String[] statesOfZambia = {
"Lusaka","Copperbelt","Southern","Eastern","Northern","Central","Western","Luapula","Muchinga","North-Western"
};
return statesOfZambia;}

else if(country == "Guatemala"){
String[] statesOfGuatemala = {
"Guatemala","Alta Verapaz","Baja Verapaz","Chimaltenango","Escuintla","Huehuetenango","Izabal","Jutiapa","Petén","Quetzaltenango"
};
return statesOfGuatemala;}

else if(country == "Ecuador"){
String[] statesOfEcuador = {
"Pichincha","Guayas","Azuay","Manabi","El Oro","Loja","Tungurahua","Chimborazo","Imbabura","Los Rios"
};
return statesOfEcuador;}

else if(country == "Syria"){
String[] statesOfSyria = {
"Damascus","Aleppo","Homs","Hama","Latakia","Tartus","Deir ez-Zor","Raqqa","Hasakah","Daraa"
};
return statesOfSyria;}

else if(country == "Netherlands"){
String[] statesOfNetherlands = {
"North Holland","South Holland","Utrecht","Gelderland","North Brabant","Overijssel","Limburg","Friesland","Groningen","Drenthe"
};
return statesOfNetherlands;}

else if(country == "Senegal"){
String[] statesOfSenegal = {
"Dakar","Thiès","Diourbel","Saint-Louis","Ziguinchor","Kaolack","Tambacounda","Kolda","Matam","Fatick"
};
return statesOfSenegal;}

else if(country == "Cambodia"){
String[] statesOfCambodia = {
"Phnom Penh","Siem Reap","Battambang","Kampong Cham","Kampot","Takeo","Prey Veng","Kandal","Banteay Meanchey","Pursat"
};
return statesOfCambodia;}

else if(country == "Chad"){
String[] statesOfChad = {
"N'Djamena","Logone Occidental","Logone Oriental","Mayo-Kebbi","Ouaddai","Salamat","Batha","Guera","Kanem","Lac"
};
return statesOfChad;}

else if(country == "Somalia"){
String[] statesOfSomalia = {
"Banaadir","Puntland","Somaliland","Jubaland","Galmudug","Hirshabelle","South West State","Mudug","Bay","Lower Shabelle"
};
return statesOfSomalia;}

else if(country == "Zimbabwe"){
String[] statesOfZimbabwe = {
"Harare","Bulawayo","Manicaland","Mashonaland Central","Mashonaland East","Mashonaland West","Masvingo","Matabeleland North","Matabeleland South","Midlands"
};
return statesOfZimbabwe;}

else if(country == "Guinea"){
String[] statesOfGuinea = {
"Conakry","Kindia","Boke","Mamou","Labe","Faranah","Kankan","Nzerekore"
};
return statesOfGuinea;}

else if(country == "Rwanda"){
String[] statesOfRwanda = {
"Kigali","Northern","Southern","Eastern","Western"
};
return statesOfRwanda;}

else if(country == "Benin"){
String[] statesOfBenin = {
"Alibori","Atakora","Atlantique","Borgou","Collines","Donga","Kouffo","Littoral","Mono","Oueme"
};
return statesOfBenin;}

else if(country == "Burundi"){
String[] statesOfBurundi = {
"Bujumbura","Gitega","Ngozi","Kirundo","Muyinga","Ruyigi","Cibitoke","Kayanza","Bubanza","Makamba"
};
return statesOfBurundi;}

else if(country == "Tunisia"){
String[] statesOfTunisia = {
"Tunis","Sfax","Sousse","Ariana","Kairouan","Bizerte","Gabes","Nabeul","Kasserine","Monastir"
};
return statesOfTunisia;}

else if(country == "Bolivia"){
String[] statesOfBolivia = {
"La Paz","Santa Cruz","Cochabamba","Oruro","Potosi","Tarija","Chuquisaca","Beni","Pando"
};
return statesOfBolivia;}

else if(country == "Belgium"){
String[] statesOfBelgium = {
"Flanders","Wallonia","Brussels"
};
return statesOfBelgium;}

else if(country == "Haiti"){
String[] statesOfHaiti = {
"Ouest","Nord","Sud","Artibonite","Grand'Anse","Centre","Nord-Est","Nord-Ouest","Sud-Est","Nippes"
};
return statesOfHaiti;}

else if(country == "Cuba"){
String[] statesOfCuba = {
"Havana","Santiago de Cuba","Holguin","Camaguey","Villa Clara","Matanzas","Pinar del Rio","Granma","Guantanamo","Cienfuegos"
};
return statesOfCuba;}

else if(country == "South Sudan"){
String[] statesOfSouthSudan = {
"Central Equatoria","Eastern Equatoria","Western Equatoria","Jonglei","Unity","Upper Nile","Lakes","Northern Bahr el Ghazal","Western Bahr el Ghazal","Warrap"
};
return statesOfSouthSudan;}

else if(country == "Dominican Republic"){
String[] statesOfDominicanRepublic = {
"Santo Domingo","Santiago","La Vega","San Cristobal","San Pedro de Macoris","La Altagracia","Puerto Plata","Duarte","La Romana","Peravia"
};
return statesOfDominicanRepublic;}

else if(country == "Czech Republic"){
String[] statesOfCzechRepublic = {
"Prague","Central Bohemian","South Bohemian","Plzen","Karlovy Vary","Usti nad Labem","Liberec","Hradec Kralove","Pardubice","Vysocina"
};
return statesOfCzechRepublic;}

else if(country == "Greece"){
String[] statesOfGreece = {
"Attica","Central Macedonia","Western Greece","Crete","Thessaly","Peloponnese","Epirus","Eastern Macedonia and Thrace","Ionian Islands","South Aegean"
};
return statesOfGreece;}

else if(country == "Jordan"){
String[] statesOfJordan = {
"Amman","Irbid","Zarqa","Aqaba","Balqa","Karak","Madaba","Mafraq","Tafilah","Jerash"
};
return statesOfJordan;}

else if(country == "Portugal"){
String[] statesOfPortugal = {
"Lisbon","Porto","Braga","Setubal","Coimbra","Faro","Aveiro","Leiria","Madeira","Azores"
};
return statesOfPortugal;}

else if(country == "Azerbaijan"){
String[] statesOfAzerbaijan = {
"Baku","Ganja","Sumqayit","Lankaran","Shaki","Shirvan","Mingachevir","Quba","Nakhchivan","Yevlakh"
};
return statesOfAzerbaijan;}

else if(country == "Sweden"){
String[] statesOfSweden = {
"Stockholm","Skane","Vastra Gotaland","Uppsala","Ostergotland","Halland","Jonkoping","Dalarna","Vasterbotten","Orebro"
};
return statesOfSweden;}

else if(country == "United Arab Emirates"){
String[] statesOfUAE = {
"Abu Dhabi","Dubai","Sharjah","Ajman","Ras Al Khaimah","Fujairah","Umm Al Quwain"
};
return statesOfUAE;}

else if(country == "Hungary"){
String[] statesOfHungary = {
"Budapest","Pest","Borsod-Abauj-Zemplen","Gyor-Moson-Sopron","Hajdu-Bihar","Szabolcs-Szatmar-Bereg","Bacs-Kiskun","Baranya","Fejer","Csongrad-Csanad"
};
return statesOfHungary;}

else if(country == "Belarus"){
String[] statesOfBelarus = {
"Minsk","Brest","Gomel","Grodno","Mogilev","Vitebsk"
};
return statesOfBelarus;}

else if(country == "Tajikistan"){
String[] statesOfTajikistan = {
"Dushanbe","Sughd","Khatlon","Gorno-Badakhshan"
};
return statesOfTajikistan;}

else if(country == "Austria"){
String[] statesOfAustria = {
"Vienna","Lower Austria","Upper Austria","Styria","Tyrol","Carinthia","Salzburg","Vorarlberg","Burgenland"
};
return statesOfAustria;}

else if(country == "Honduras"){
String[] statesOfHonduras = {
"Cortes","Francisco Morazan","Atlantida","Choluteca","Comayagua","Copan","El Paraiso","Intibuca","Olancho","Yoro"
};
return statesOfHonduras;}

else if(country == "Switzerland"){
String[] statesOfSwitzerland = {
"Zurich","Bern","Vaud","Aargau","St. Gallen","Geneva","Lucerne","Ticino","Valais","Basel-Stadt"
};
return statesOfSwitzerland;}

else if(country == "Israel"){
String[] statesOfIsrael = {
"Jerusalem","Tel Aviv","Haifa","Central","Southern","Northern"
};
return statesOfIsrael;}

else if(country == "Papua New Guinea"){
String[] statesOfPapuaNewGuinea = {
"National Capital District","Morobe","Eastern Highlands","Western Highlands","Madang","East Sepik","West Sepik","Chimbu","Enga","Milne Bay"
};
return statesOfPapuaNewGuinea;}

else if(country == "Serbia"){
String[] statesOfSerbia = {
"Belgrade","Vojvodina","Sumadija","South Backa","Kolubara","Macva","Raska","Zlatibor","Nisava","Toplica"
};
return statesOfSerbia;}

else if(country == "Bulgaria"){
String[] statesOfBulgaria = {
"Sofia","Plovdiv","Varna","Burgas","Ruse","Stara Zagora","Pleven","Sliven","Dobrich","Shumen"
};
return statesOfBulgaria;}

else if(country == "Laos"){
String[] statesOfLaos = {
"Vientiane","Savannakhet","Champasak","Luang Prabang","Khammouane","Oudomxay","Bokeo","Bolikhamsai","Attapeu","Xiengkhouang"
};
return statesOfLaos;}

else if(country == "Paraguay"){
String[] statesOfParaguay = {
"Asuncion","Central","Alto Parana","Itapua","Caaguazu","San Pedro","Cordillera","Guaira","Caazapa","Amambay"
};
return statesOfParaguay;}

else if(country == "Libya"){
String[] statesOfLibya = {
"Tripoli","Benghazi","Misrata","Zawiya","Sabha","Sirte","Bayda","Ajdabiya","Derna","Nalut"
};
return statesOfLibya;}

else if(country == "Lebanon"){
String[] statesOfLebanon = {
"Beirut","Mount Lebanon","North","South","Bekaa","Nabatieh"
};
return statesOfLebanon;}

else if(country == "Nicaragua"){
String[] statesOfNicaragua = {
"Managua","Leon","Chinandega","Matagalpa","Masaya","Esteli","Granada","Carazo","Rivas","Jinotega"
};
return statesOfNicaragua;}

else if(country == "Kyrgyzstan"){
String[] statesOfKyrgyzstan = {
"Bishkek","Osh","Chuy","Issyk-Kul","Jalal-Abad","Naryn","Talas","Batken"
};
return statesOfKyrgyzstan;}

else if(country == "El Salvador"){
String[] statesOfElSalvador = {
"San Salvador","La Libertad","Santa Ana","San Miguel","Sonsonate","Usulutan","Ahuachapan","La Paz","Cabanas","Morazan"
};
return statesOfElSalvador;}

else if(country == "Turkmenistan"){
String[] statesOfTurkmenistan = {
"Ashgabat","Ahal","Balkan","Dashoguz","Lebap","Mary"
};
return statesOfTurkmenistan;}

else if(country == "Singapore"){
String[] statesOfSingapore = {
"Central","East","North","North-East","West"
};
return statesOfSingapore;}

else if(country == "Denmark"){
String[] statesOfDenmark = {
"Capital Region","Zealand","Southern Denmark","Central Denmark","North Denmark"
};
return statesOfDenmark;}

else if(country == "Finland"){
String[] statesOfFinland = {
"Uusimaa","Pirkanmaa","Southwest Finland","North Ostrobothnia","Northern Savonia","Central Finland","Lapland","Kymenlaakso","Satakunta","Ostrobothnia"
};
return statesOfFinland;}

else if(country == "Slovakia"){
String[] statesOfSlovakia = {
"Bratislava","Kosice","Presov","Zilina","Nitra","Banska Bystrica","Trencin","Trnava"
};
return statesOfSlovakia;}

else if(country == "Norway"){
String[] statesOfNorway = {
"Oslo","Viken","Vestland","Rogaland","Trondelag","Innlandet","Agder","Nordland","Troms og Finnmark","More og Romsdal"
};
return statesOfNorway;}

else if(country == "Oman"){
String[] statesOfOman = {
"Muscat","Dhofar","Al Batinah North","Al Batinah South","Al Dakhiliyah","Al Sharqiyah North","Al Sharqiyah South","Al Dhahirah","Al Buraimi","Musandam"
};
return statesOfOman;}

else if(country == "Costa Rica"){
String[] statesOfCostaRica = {
"San Jose","Alajuela","Cartago","Heredia","Guanacaste","Puntarenas","Limon"
};
return statesOfCostaRica;}

else if(country == "Panama"){
String[] statesOfPanama = {
"Panama","Panama Oeste","Colon","Chiriqui","Cocle","Veraguas","Herrera","Los Santos","Darien","Bocas del Toro"
};
return statesOfPanama;}

else if(country == "Ireland"){
String[] statesOfIreland = {
"Dublin","Cork","Galway","Limerick","Kerry","Donegal","Mayo","Kildare","Meath","Clare"
};
return statesOfIreland;}

else if(country == "New Zealand"){
String[] statesOfNewZealand = {
"Auckland","Canterbury","Wellington","Waikato","Otago","Bay of Plenty","Manawatu-Whanganui","Northland","Hawke's Bay","Taranaki"
};
return statesOfNewZealand;}

else if(country == "Mauritania"){
String[] statesOfMauritania = {
"Nouakchott","Hodh Ech Chargui","Hodh El Gharbi","Assaba","Gorgol","Brakna","Trarza","Adrar","Dakhlet Nouadhibou","Tagant"
};
return statesOfMauritania;}

else if(country == "Croatia"){
String[] statesOfCroatia = {
"Zagreb","Split-Dalmatia","Primorje-Gorski Kotar","Osijek-Baranja","Istria","Zadar","Vukovar-Syrmia","Sisak-Moslavina","Karlovac","Varazdin"
};
return statesOfCroatia;}

else if(country == "Georgia"){
String[] statesOfGeorgia = {
"Tbilisi","Adjara","Imereti","Kvemo Kartli","Kakheti","Samegrelo-Zemo Svaneti","Shida Kartli","Samtskhe-Javakheti","Guria","Mtskheta-Mtianeti"
};
return statesOfGeorgia;}

else if(country == "Eritrea"){
String[] statesOfEritrea = {
"Maekel","Debub","Anseba","Gash-Barka","Northern Red Sea","Southern Red Sea"
};
return statesOfEritrea;}

else if(country == "Uruguay"){
String[] statesOfUruguay = {
"Montevideo","Canelones","Maldonado","Salto","Paysandu","Colonia","Rivera","Tacuarembo","San Jose","Soriano"
};
return statesOfUruguay;}

else if(country == "Bosnia and Herzegovina"){
String[] statesOfBosnia = {
"Federation of Bosnia and Herzegovina","Republika Srpska","Brcko District"
};
return statesOfBosnia;}

else if(country == "Mongolia"){
String[] statesOfMongolia = {
"Ulaanbaatar","Orkhon","Darkhan-Uul","Khentii","Khovd","Selenge","Bulgan","Arkhangai","Bayankhongor","Zavkhan"
};
return statesOfMongolia;}

else if(country == "Armenia"){
String[] statesOfArmenia = {
"Yerevan","Ararat","Shirak","Lori","Kotayk","Tavush","Syunik","Gegharkunik","Armavir","Vayots Dzor"
};
return statesOfArmenia;}

else if(country == "Jamaica"){
String[] statesOfJamaica = {
"Kingston","Saint Andrew","Saint Catherine","Clarendon","Manchester","Saint James","Westmoreland","Saint Ann","Trelawny","Portland"
};
return statesOfJamaica;}

else if(country == "Qatar"){
String[] statesOfQatar = {
"Doha","Al Rayyan","Al Wakrah","Al Khor","Umm Salal","Al Daayen","Al Shamal","Al Shahaniya"
};
return statesOfQatar;}

else if(country == "Albania"){
String[] statesOfAlbania = {
"Tirana","Durres","Fier","Shkoder","Elbasan","Vlore","Korce","Berat","Diber","Lezhe"
};
return statesOfAlbania;}

else if(country == "Lithuania"){
String[] statesOfLithuania = {
"Vilnius","Kaunas","Klaipeda","Siauliai","Panevezys","Alytus","Marijampole","Telsiai","Taurage","Utena"
};
return statesOfLithuania;}
else if(country == "Moldova"){
String[] statesOfMoldova = {
"Chisinau","Balti","Tiraspol","Bender","Orhei","Ungheni","Cahul","Soroca","Comrat","Edinet"
};
return statesOfMoldova;}

else if(country == "Namibia"){
String[] statesOfNamibia = {
"Khomas","Erongo","Oshana","Omusati","Ohangwena","Oshikoto","Otjozondjupa","Kunene","Hardap","Karas"
};
return statesOfNamibia;}

else if(country == "Botswana"){
String[] statesOfBotswana = {
"Gaborone","Francistown","Central","Kweneng","North West","Kgalagadi","Ghanzi","Southern","North East","South East"
};
return statesOfBotswana;}

else if(country == "Gabon"){
String[] statesOfGabon = {
"Estuaire","Haut-Ogooue","Moyen-Ogooue","Ngounie","Nyanga","Ogooue-Ivindo","Ogooue-Lolo","Ogooue-Maritime","Woleu-Ntem"
};
return statesOfGabon;}

else if(country == "Lesotho"){
String[] statesOfLesotho = {
"Maseru","Leribe","Berea","Mafeteng","Mohale's Hoek","Quthing","Qacha's Nek","Mokhotlong","Thaba-Tseka","Botha-Bothe"
};
return statesOfLesotho;}

else if(country == "Guinea-Bissau"){
String[] statesOfGuineaBissau = {
"Bissau","Bafata","Gabu","Cacheu","Oio","Quinara","Tombali","Bolama"
};
return statesOfGuineaBissau;}

else if(country == "Slovenia"){
String[] statesOfSlovenia = {
"Ljubljana","Maribor","Celje","Kranj","Koper","Novo Mesto","Velenje","Ptuj","Murska Sobota","Nova Gorica"
};
return statesOfSlovenia;}

else if(country == "North Macedonia"){
String[] statesOfNorthMacedonia = {
"Skopje","Bitola","Kumanovo","Prilep","Tetovo","Ohrid","Strumica","Veles","Stip","Gostivar"
};
return statesOfNorthMacedonia;}

else if(country == "Latvia"){
String[] statesOfLatvia = {
"Riga","Daugavpils","Liepaja","Jelgava","Jurmala","Ventspils","Rezekne","Valmiera","Jekabpils","Ogre"
};
return statesOfLatvia;}

else if(country == "Bahrain"){
String[] statesOfBahrain = {
"Capital","Muharraq","Northern","Southern"
};
return statesOfBahrain;}

else if(country == "Trinidad and Tobago"){
String[] statesOfTrinidad = {
"Port of Spain","San Fernando","Chaguanas","Arima","Point Fortin","Couva-Tabaquite-Talparo","Diego Martin","Penal-Debe","Princes Town","Siparia"
};
return statesOfTrinidad;}

else if(country == "Timor-Leste"){
String[] statesOfTimorLeste = {
"Dili","Baucau","Ermera","Bobonaro","Liquica","Viqueque","Manatuto","Ainaro","Manufahi","Cova Lima"
};
return statesOfTimorLeste;}

else if(country == "Estonia"){
String[] statesOfEstonia = {
"Harju","Tartu","Ida-Viru","Parnu","Laaene-Viru","Viljandi","Rapla","Saare","Valga","Jogeva"
};
return statesOfEstonia;}

else if(country == "Mauritius"){
String[] statesOfMauritius = {
"Port Louis","Plaines Wilhems","Moka","Flacq","Grand Port","Savanne","Riviere du Rempart","Black River","Pamplemousses"
};
return statesOfMauritius;}

else if(country == "Cyprus"){
String[] statesOfCyprus = {
"Nicosia","Limassol","Larnaca","Famagusta","Paphos","Kyrenia"
};
return statesOfCyprus;}

else if(country == "Djibouti"){
String[] statesOfDjibouti = {
"Djibouti","Ali Sabieh","Dikhil","Tadjourah","Obock","Arta"
};
return statesOfDjibouti;}

else if(country == "Fiji"){
String[] statesOfFiji = {
"Central","Western","Northern","Eastern","Rotuma"
};
return statesOfFiji;}

else if(country == "Comoros"){
String[] statesOfComoros = {
"Grande Comore","Anjouan","Moheli"
};
return statesOfComoros;}

else if(country == "Guyana"){
String[] statesOfGuyana = {
"Region 1","Region 2","Region 3","Region 4","Region 5","Region 6","Region 7","Region 8","Region 9","Region 10"
};
return statesOfGuyana;}

else if(country == "Solomon Islands"){
String[] statesOfSolomonIslands = {
"Central","Choiseul","Guadalcanal","Honiara","Isabel","Makira-Ulawa","Malaita","Rennell and Bellona","Temotu","Western"
};
return statesOfSolomonIslands;}

else if(country == "Bhutan"){
String[] statesOfBhutan = {
"Thimphu","Paro","Punakha","Wangdue Phodrang","Samdrup Jongkhar","Chukha","Trashigang","Trongsa","Bumthang","Haa"
};
return statesOfBhutan;}

else if(country == "Montenegro"){
String[] statesOfMontenegro = {
"Podgorica","Niksic","Herceg Novi","Pljevlja","Bijelo Polje","Bar","Budva","Cetinje","Kotor","Ulcinj"
};
return statesOfMontenegro;}

else if(country == "Luxembourg"){
String[] statesOfLuxembourg = {
"Luxembourg","Esch-sur-Alzette","Differdange","Dudelange","Ettelbruck","Diekirch","Wiltz","Grevenmacher","Remich","Clervaux"
};
return statesOfLuxembourg;}

else if(country == "Suriname"){
String[] statesOfSuriname = {
"Paramaribo","Wanica","Nickerie","Marowijne","Commewijne","Saramacca","Para","Brokopondo","Coronie","Sipaliwini"
};
return statesOfSuriname;}

else if(country == "Maldives"){
String[] statesOfMaldives = {
"Male","Addu City","Fuvahmulah","Kulhudhuffushi","Thinadhoo","Naifaru","Eydhafushi","Mahibadhoo","Viligili","Hinnavaru"
};
return statesOfMaldives;}

else if(country == "Malta"){
String[] statesOfMalta = {
"Valletta","Birkirkara","Mosta","Qormi","Zabbar","Sliema","San Pawl il-Bahar","Fgura","Zejtun","Rabat"
};
return statesOfMalta;}

else if(country == "Brunei"){
String[] statesOfBrunei = {
"Brunei-Muara","Belait","Tutong","Temburong"
};
return statesOfBrunei;}

else if(country == "Iceland"){
String[] statesOfIceland = {
"Capital Region","Southern Peninsula","Western Region","Westfjords","Northwest","Northeast","East","South"
};
return statesOfIceland;}

else if(country == "Vanuatu"){
String[] statesOfVanuatu = {
"Shefa","Sanma","Malampa","Penama","Tafea","Torba"
};
return statesOfVanuatu;}

else if(country == "Barbados"){
String[] statesOfBarbados = {
"Christ Church","Saint Andrew","Saint George","Saint James","Saint John","Saint Joseph","Saint Lucy","Saint Michael","Saint Peter","Saint Philip","Saint Thomas"
};
return statesOfBarbados;}

else if(country == "Sao Tome and Principe"){
String[] statesOfSaoTome = {
"Agua Grande","Me-Zochi","Lobata","Cantagalo","Lemba","Caué","Principe"
};
return statesOfSaoTome;}

else if(country == "Samoa"){
String[] statesOfSamoa = {
"Apia","Tuamasaga","Aana","Atua","Gagaemauga","Gagaifomauga","Palauli","Satupaitea","Va'a-o-Fonoti","Vaisigano"
};
return statesOfSamoa;}

else if(country == "Saint Lucia"){
String[] statesOfSaintLucia = {
"Castries","Gros Islet","Vieux Fort","Micoud","Soufriere","Dennery","Choiseul","Anse la Raye","Canaries","Laborie"
};
return statesOfSaintLucia;}

else if(country == "Kiribati"){
String[] statesOfKiribati = {
"South Tarawa","Betio","Abaiang","Abemama","Aranuka","Beru","Butaritari","Kiritimati","Maiana","Nonouti"
};
return statesOfKiribati;}

else if(country == "Grenada"){
String[] statesOfGrenada = {
"Saint George","Saint Andrew","Saint David","Saint John","Saint Mark","Saint Patrick","Carriacou and Petite Martinique"
};
return statesOfGrenada;}

else if(country == "Tonga"){
String[] statesOfTonga = {
"Tongatapu","Vava'u","Ha'apai","Eua","Niuas"
};
return statesOfTonga;}

else if(country == "Saint Vincent and the Grenadines"){
String[] statesOfSaintVincent = {
"Saint George","Saint Andrew","Saint David","Saint Patrick","Charlotte","Grenadines"
};
return statesOfSaintVincent;}

else if(country == "Antigua and Barbuda"){
String[] statesOfAntigua = {
"Saint John","Saint George","Saint Mary","Saint Paul","Saint Peter","Saint Philip","Barbuda","Redonda"
};
return statesOfAntigua;}

else if(country == "Seychelles"){
String[] statesOfSeychelles = {
"Anse Boileau","Anse Etoile","Anse Royale","Baie Lazare","Baie Sainte Anne","Beau Vallon","Bel Air","Cascade","English River","Grand Anse"
};
return statesOfSeychelles;}

else if(country == "Saint Kitts and Nevis"){
String[] statesOfSaintKitts = {
"Saint George Basseterre","Saint John Capisterre","Saint Mary Cayon","Saint Paul Charlestown","Saint Peter Basseterre","Trinity Palmetto Point"
};
return statesOfSaintKitts;}

else if(country == "Marshall Islands"){
String[] statesOfMarshallIslands = {
"Majuro","Ebeye","Jaluit","Wotje","Arno","Mili","Likiep","Ailinglaplap","Kwajalein","Utrik"
};
return statesOfMarshallIslands;}

else if(country == "Micronesia"){
String[] statesOfMicronesia = {
"Yap","Chuuk","Pohnpei","Kosrae"
};
return statesOfMicronesia;}

else if(country == "Dominica"){
String[] statesOfDominica = {
"Saint George","Saint Andrew","Saint David","Saint John","Saint Joseph","Saint Luke","Saint Mark","Saint Patrick","Saint Paul","Saint Peter"
};
return statesOfDominica;}

else if(country == "Monaco"){
String[] statesOfMonaco = {
"Monaco-Ville","La Condamine","Monte Carlo","Fontvieille"
};
return statesOfMonaco;}

else if(country == "Liechtenstein"){
String[] statesOfLiechtenstein = {
"Vaduz","Schaan","Balzers","Triesen","Eschen","Mauren","Triesenberg","Ruggell","Gamprin","Schellenberg","Planken"
};
return statesOfLiechtenstein;}

else if(country == "San Marino"){
String[] statesOfSanMarino = {
"San Marino","Acquaviva","Borgo Maggiore","Chiesanuova","Domagnano","Faetano","Fiorentino","Montegiardino","Serravalle"
};
return statesOfSanMarino;}

else if(country == "Andorra"){
String[] statesOfAndorra = {
"Andorra la Vella","Canillo","Encamp","Escaldes-Engordany","La Massana","Ordino","Sant Julia de Loria"
};
return statesOfAndorra;}

else if(country == "Palau"){
String[] statesOfPalau = {
"Koror","Melekeok","Airai","Aimeliik","Angaur","Kayangel","Ngaraard","Ngardmau","Ngchesar","Peleliu"
};
return statesOfPalau;}

else if(country == "Nauru"){
String[] statesOfNauru = {
"Aiwo","Anabar","Anetan","Anibare","Baiti","Boe","Buada","Denigomodu","Ewa","Ijuw","Meneng","Nibok","Uaboe","Yaren"
};
return statesOfNauru;}

else if(country == "Tuvalu"){
String[] statesOfTuvalu = {
"Funafuti","Nanumea","Nanumanga","Niutao","Nui","Vaitupu","Nukufetau","Nukulaelae","Niulakita"
};
return statesOfTuvalu;}

else if(country == "Vatican City"){
String[] statesOfVaticanCity = {
"Vatican City"
};
return statesOfVaticanCity;}

}else{System.out.println("The country name you entered has spelling mistake ,Please check it and try again...!");}
   return null;
}
 static void printStates(String []states){
	 System.out.println("fetching states");
for(String state : states){
System.out.println(state);}
System.out.println("above is the state list");
 
}}