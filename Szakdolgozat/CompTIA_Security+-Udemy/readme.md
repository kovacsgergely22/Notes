# CompTIA Security+ (SY0-701) - Dion Training

## Section 1 - Introduction

## Section 2 - Fundamentals of Security

### Fundamentals of Security

- Bad Actors, akik próbálnak betörni a hálózatunkba, ellopni adatainkat
- Belső fenyegetések: végfelhasználóink, próbálják megkerülni belső biztonsági ellenőrzéseket is
- Súrlódás a hálózat biztonsága és kényelme között
- pl. kábelszolgáltatótól kapott router bonyolult jelszava, 
  - egyszerűbbre változtatás -> gond, 
  - ha megmarad akárkinek leolvasható
- Biztonság <-> könnyen használhatóság
- Kibertámadások oka: lazítunk a biztonságon a kényelem érdekében
- 2022 -> nagyvállalatok 4.35 millió dollárt költöttek adatsértésenként

#### Információbiztonság (Information Security)

- "Az információbiztonság az adatok és információk védelme a jogosulatlan hozzáféréstől, a jogellenes módosítástól és megzavarástól, a nyilvánosságra hozataltól, vagy a korrupciótól valamint a megsemmisítéstől."
- Rendszereken tárolt adatok a téma, nem a rendszerek

#### Információs rendszerek biztonsága

- "A kritikus adatainkat tároló és feldolgozó rendszerek védelmét jelenti."
- Számítógép, szerver, hálózati eszköz, okostelefon stb.

#### CIA

- ***Confidentiality (bizalmasság, titoktartás) - Encryption (titkosítás, titkosság)***
  - Az érzékeny és magánjellegű információhoz csak a megfelelő jogosultsággal rendelkező férjen hozzá, illetéktelen személy, szervezet vagy eljárás számára ne.
  - bankos példa, látható érzékeny adatokat tartalmazó iratok
  - Az adatokat titokban és biztonságban kell tartani a kíváncsi szemek elől, de rendelkezésre bocsátani az arra jogosultak számára
  - Fontos:
    - A személyes adatok védelme miatt
    - Üzleti előnyök fenntartása miatt
    - Jogszabályi megfelelés miatt -> nem betartás nagy összegű bírságok
      - PII: Személyazonosításra alkalmas adatok
      - PHI: Védett egészségügyi információk
      - Various types of financial data: pénzügyi és más típusú adatok
  - **Módszerek:**
    - *Encryption - Titkosítás*: Adatok kóddá alakítása a jogosulatlan hozzáférés megakadályozása érdekében.
      - plain text -> chiper text
    - *Access control - Hozzáférés ellenőrzés*: Az erős felhasználói jogosultságok beállításával -> csak az arra jogosultak férjenek hozzás bizonyos típusú adatokhoz
      - jelszóval védett fájlok létrehozásával
      - adatbázishoz való hozzáférés felhasználónév-jelszó vagy egyéb más azonosítási mód felhasználásával
    - *Data masking - adatmaszkolás*: olyan módszer, amelynek lényege, hogy egy adatbázisban bizonyos adatokat elfednek, hogy azok hozzáférhetetlenné váljanak a jogosulatlan felhasználók számára, miközben a valódi adatok hitelessége és felhasználása megmarad az engedélyezett felhasználók számára.
      - például bankkártyánál, csak az utolsó 4 számjegy jelenik meg a blokkon és az ügyfélszolgálati ügynökök számára.
    - *Physical Security Measures - fizikai biztonsági intézkedések*: mind a fizikai adattípusok (irattárban tárolt papíralapú nyilvántartások), mind a szervereken és munkaállomásokon tárolt digitális információk titkosságának biztosítására szolgálnak.
      - szekrény zárása, biometrikus biztonsági zárak szerverszoba ajtaján, biztonsági kamerák
    - *Training and awareness - Képzés és tudatosság*: gyakran a titoktartás megsértése emberi hiba, hanyagság, vagy rosszindulatú szándék miatt következik be.
      - képzés a biztonságra vonatkozó legjobb gyakorlatokról
- ***Integrity (integritás)***
  - Adatok pontosak és változatlanok maradjanak, hacsak nem szükséges a módosítás
    - ellenőrző összegek
  - **Fontos:**
    - *Ensure Data Accuracy - Adatok pontosságának biztosítása*
    - *Maintain Trust - Bizalom megőrzése*
    - *Ensure System Operability - rendszer működőképességének biztosítása*
- Availability (rendelkezésre állás)
  - Az információs erőforrások elérhetők és működőképesek legyenek az arra jogosult felhasználóknak, amikor szükségük van rájuk
  - redundancia -> minden elérhető nagy forgalmú időszakban is
- Non-repudiation (tagadhatatlanság)
  - A tagadhatatlanság annak garantálását jelenti, hogy egy adott cselekmény vagy esemény megtörtént, az érintett felek nem tudják letagadni.
  - digitális aláírás
- Authentication (hitelesítés)
  - Authentication (hitelesítés)
    - A felhasználó vagy a rendszer személyazonosságának ellenőrzése
    - bejelentkezés felhasználónévvel és jelszóval -> ezek összevetése egy tárolt verzióval
  - Authorization (engedélyezés)
    - Meghatározza a hitelesítés után, hogy a hitelesített felhasználó milyen műveletek és erőforrások elvégzéséhez rendelkezik jogosultságokkal -> felhasználók között eltérő jogosultságok
      - szerkesztési
      - megtekintési
  - Accounting (elszámolás, könyvelés)
    - A felhasználói tevékenységek és az erőforrás-felhasználás nyomon követése
    - naplózás

#### Biztonsági ellenőrzési kategóriák

- Security Controls (biztonsági ellenőrzések)
  - Olyan intézkedések vagy mechanizmusok, amelyeket a kockázatok mérséklésére, valamint az információs rendszerek és adataik bizalmasságának, integritásának és rendelkezésre állásának védelmére hoztak létre.
  - Csoportosítása
    - Technical (technikai)
    - Managerial (vezetői)
    - Operational (működési)
    - Phisical (fizikai)
  - Másik csoportosítás
    - Preventative (megelőző)
    - Deterrent (elrettentő)
    - Detective (detektív)
    - Corrective (korrekciós)
    - Compensating (kompenzáló)
    - Directive (irányító) ellenőrzések

#### Zero Trust

- Egy újabb biztonsági modell, amely szerint senki (sem a szervezeten belül, sem azon kívül) nem lehet megbízható -> mindenkitől, aki a rendszer erőforrásaihoz akar férni, ellenőrzést kell kérni
  - Control Plane (vezérlőterv)
    - Az adaptív identitásból, a fenyegetések hatókörének csökkentéséből, a házirendvezérelt hozzáférés-szabályozásból és a biztonságos zónákból áll
  - Data Plane (adatterv)
    - A témára és a rendszerre, a házirend-motorra, a házirend-kezelőre, és a házirend-kényszerítő pontokra összpontosít

### Threats and Vulnerabilities

- Kiberbiztonsági szakemberként cél: megakadályozni, hogy a fenyegetések kihasználják a vállalati rendszerek sebezhetőségeit
- Threat (fenyegetés): Minden olyan dolog, amely kárt, veszteséget, sérülést vagy veszélyt okozhat informatikai rendszereinkben
  - Külső forrásból származnak:
    - Természeti katasztrófák
    - kibertámadásokból
    - adatintegritás megsértésből
    - bizalmas információk nyilvánosságra hozatalából
    - egyéb
  - csak minimálizálhatók, nem tudjuk elkerülni -> sebezhetőségek ellenőrzése
- Vulnerability (sebezhetőség): A rendszer tervezésének vagy megvalósításának bármely gyenge pontja
  - Belső tényezőkből erednek:
    - Szoftverhibák
    - Rosszul konfigurált szoftverek
    - Nem megfelelően védett hálózati eszközökből
    - Hiányzó biztonsági javításokból
    - A fizika biztonság hiányából
    - egyéb
  - A mi, vagyis szervezetünk ellenőrzése alatt állnak, megakadályozhatjuk a sebezhetőségek kihasználását:
    - mérsékeljük, áthelyezzük, elkerüljük vagy elfogadjuk a sebezhetőségekkel járó kockázatot ->
    - kockázatkezelési döntés
- Ahol a Threats (fenyegetések) és Vulnerabilities (sebezhetőségek) keresztezik egymást, ott van a kockázata a vállalati rendszereknek és hálózatoknak.
  - Ha van egy fenyegetés, de nincs hozzá illő sebezhetőség, akkor nincs kockázat.
  - Ha van egy sebezhetőség, de nincs ellene megfelelő fenyegetés, akkor nincs kockázat sem. -> reggel munkahelyre beérős példa
- Kockázatkezelés: különböző módokat kell találni arra, hogy minimalizáljuk egy bizonyos kimenetel bekövetkezésének valószínűségét, és elérjük azokat az eredményeket, amelyeket valóban el akarunk érni.
  - Szolgáltatások folyamatosságának fenntartása
  - Rendszereink általános biztonságának fenntartása
  - Sebezhetőségek minimalizálásával meg akarjuk védeni szervezetünket az adatbiztonság megsértésétől.
  - Vagy megfelelő enyhítő intézkedések annak érdekében, hogy minimalizáljuk a fenyegetés hatását a vállalati rendszereinkre, ha a kockázat megvalósult

## Section 17 Identity and Access Management (IAM) Solutions

- Az azonosság- és hozzáférés-kezelés (IAM) az információbiztonság alapvető eleme, amely biztosítja, hogy a megfelelő személyek a megfelelő időben, a megfelelő okból a megfelelő erőforrásokhoz férjenek hozzá.
- Az azonosság- és hozzáférés-kezelési technológiák olyan eszközöket biztosítanak az üzleti folyamatokhoz, amelyek megkönnyítik az elektronikus személyazonosságok kezelését, beleértve a jelszókezelést, a hálózati hozzáférés-ellenőrzést és a digitális személyazonosságok kezelését.
- Az azonosság- és hozzáférés-kezelés a biztonsági ellenőrzésekre, az azonosítási technikákra, a hozzáférés-ellenőrzésre és a fiókkezelésre összpontosít annak biztosítása érdekében, hogy csak az arra jogosult felhasználók férjenek hozzá bizonyos erőforrásokhoz és adatokhoz.
  - Identification - Azonosítás: az a folyamat, amelynek során a felhasználó személyazonosságot állít, általában felhasználónév vagy e-mail cím formájában.
  - Authentication - Hitelesítés: a felhasználó, az eszköz vagy a rendszer személyazonosságának ellenőrzésére szolgáló folyamat
  - Authorization - Engedélyezés: A felhasználó hitelesítését követően az engedélyezési folyamat határozza meg, hogy a felhasználó milyen jogosultságokkal vagy hozzáférési szintekkel rendelkezik.
  - Accounting - elszámolás, könyvelés, auditálás: a felhasználói tevékenységek nyomon követésének és rögzítésének folyamata a megfelelő biztonsági felügyelet és a múltbeli nyilvántartások céljából.
- Identity and Access Management
  - Felhasználói fiókok rendelkezésre bocsátása és megszüntetése
  - A személyazonosság igazolása
  - Interoperabilitás
  - Tanúsítás
- Multifactor Authentication (MFA)
  - Megoldások alapjai:
    - Valami, amit tudsz
    - Valami, amid van
    - Valami, ami vagy
    - Valami, amit csinálsz
    - Valahol vagy
  - Megvalósítások
    - biometrikus
    - hard tokens, soft tokens - kemény és puha tokenek
    - security keys - biztonsági kulcsok
    - pass keys - belépési kulcsok
- Password Security - jelszóbiztonság
  - jelszószabályzatok legjobb gyakorlatai
  - jelszókezelők használata
  - jelszó nélküli hitelesítés a modern személyazonosság- és hozzáférés-kezelő rendszerekben
- Password attacks - jelszótámadások
  - jelszószóró támadások
  - brute force attack - nyers erővel végrehajtott támadások
  - szótári támadások
  - hibrid támadások
- Sinle Sign-On (SSO) - egyszeri bejelentkezés: egy olyan felhasználói hitelesítési szolgáltatás, amely lehetővé teszi a felhasználó számára, hogy egyetlen bejelentkezési azonosítót, pl nevet és jelszót használjon több alkalmazáshoz való hozzáféréshez különböző technológiák pl LDAP, OAuth és SAML segítségével.
- Federation - szövetségek: egy olyan folyamat, amely lehetővé teszi az identitások megosztását és használatát több információs rendszerben vagy szervezetben, hogy a felhasználók egyetlen hitelesítő adatokkal férhessenek hozzá a különböző rendszerekhez
- Privileged Access Management (PAM) - kiváltságos hozzáférések kezelése: a just-in-time engedélyek, a jelszó páncéltermek és az ideiglenes fiókok használatát jelenti egy adott rendszer vagy eszköz feletti rendszergazdai hozzáférés megszerzéséhez
- Access Control Models - hozzáférés-szabályozási modellek
  - Mandatory Access Control - kötelező hozzáférés-szabályozás
  - Discretionaly Access Control - diszkrecionális hozzáférés-szabályozás,
  - Role-based Access Control - szerepkör-alapú hozzáférés-szabályozás
  - Rule-based Access Control - Szabályalapú hozzáférés-szabályozás
  - Attribute-based Access Control - attribútumalapú hozzáférés-szabályozás
  - napszakkorlátozások
  - legkisebb jogosultság koncepciójának megvalósítása
- Assigning Permissions - Jogosultságok kiosztása

## Section 18 Vulnerabilities and Attacks

- Vulnerabilities: A sebezhetőségek a számítógépes rendszer, hálózat vagy alkalmazás hardverének, szoftverének, konfigurációjának vagy folyamatainak olyan gyengeségeit vagy hibáit jelentik, amelyeket rosszindulatú szervezetek kihasználhatnak.
  - Ezek a gyengeségek lehetővé tehetik:
    - Unauthorized Access - illetéktelen hozzáférés
    - Data Breaches - Adatok megsértése
    - System Disruptions - rendszer megzavarását
    - kompromittálódás más formáit amelyek veszélyeztetik a hálózatunk biztonságát és integritását
- Attacks: A támadások olyan szándékos cselekmények vagy tevékenységek, amelyeket a fenyegető szereplők hajtanak végre azzal a céllal, hogy kihasználják egy számítógépes rendszer, hálózat vagy alkalmazás sebezhetőségeit.
  - Unauthorized Access - illetéktelen hozzáférés
  - Data Theft - Adatlopás
  - Malware Infections - rosszindulatú szoftverekkel fertőzés
  - Denial of Service Attacks - szolgáltatásmegtagadási támadások
  - Social engineering
  - egyéb tevékenység, melynek célja digitális eszközeink bizalmas jellegének, integritásának vagy rendelkezésre állásának veszélyeztetése

### Hardware Vulnerabilities - Hardveres sebezhetőségek

- system firmware sebezhetőségek
  - end of life - életciklus végi
  - legacy - örökölt
  - unsupported system - nem támogatott
  - missing patches - hiányzó javítások
  - misconfiguration - félrekonfigurálás
- Hogyan javíthatók:
  - Hardening the System - rendszer keményítése
  - Patching - foltozás
  - Enforcing Baseline Configurations - alapkonfigurációk érvényesítésével
  - Decommissioning Old and Insecure Assets - a régi és nem biztonságos eszközök leszerelésével
  - Creating Isolation Segmentation for Devices - eszközök elszigetelésének vagy szegmentálásának létrehozásával
- Hardware
  - Servers
  - Workstations
  - Laptops
  - Switches
  - Routers
  - Network Appliances
  - Mobile Devices
  - Internet of Things

### Bluetooth Vulnerabilities

- Bluesnarfing
- Bluejacking
- Bluebugging
- Bluesmark
- Blueborne

### Mobile Vulnerabilities

- Vulnerabilities and attacks
  - Side loading - oldalletöltés
  - Jailbraking
  - Insecure Connection Methods - ismeretlen forráshoz való nem biztonságos csatlakozási módszerek
- Megelőzés és csökkentés módszerei
  - Patch Management - javításkezelés
  - Mobile Device Management Solutions - mobileszköz-kezelési megoldások
  - Preventing Sideloading and Rooting of Devices - az eszközök oldalletöltésének és rootolásának megakadályozását.

### Zero-day Vulnerabilities

- Zero-day vulnerabilities: olyan típusú szoftver-vagy hardversebezhetőség, amelyet rosszindulatú szereplők fedeznek fel és használnak ki, mielőtt az érintett rendszer gyártójánk vagy fejlesztőjének lehetősége lett volna rá, hogy kiadjon egy javítást.

### Operating System Vulnerabilities

- Vulnerabilities
  - Unpatched system - foltozatlan rendszerek
  - Zero-Days - nulladik napi sebezhetőségek
  - Misconfiguration - Félrekonfigurálások
  - Data Exfiltration - adatszivárgás
  - Malicious Updates - rosszindulatú frissítések
- Védekezések
  - Patching - foltozás
  - Configuration management - konfigurációkezelés
  - Encryption of Data - nyugalmi adatok titkosításával
  - Installing Endpoint Protection - végpontvédelem telepítése
  - Utilizing Host-based Firewalls - host-alapú tűzfalak használata
  - Implementing Host-Based IPS - host-alapú IPS-ek bevezetése
  - Configuring Access Controls and Permissions - hozzáférés szabályozás és engedélyek konfigurálása
  - Requiring the Use of Application Allow Lists - alkalmazások engedélyezési listájának használati előírásával

### SQL and XML Injection

- SQL injection: 
  - Structured Query Language - sturktúrált lekérdezési nyelv utasításai segítségével történik
    - Parancsok:
      - Select: adott adat beolvasása az adatbázisból
      - Insert: beszúrás az adatbázisba
      - Delete: adott adat eltávolítása az adatbázisból
      - Update: adott adat felülírása az adatbázisban
  - olyan típusú kibertámadás, amely a webes alkalmazások vagy adatbázisok sebezhetőségeit használja ki.
  - a támadás során rosszindulatú inputot illesztenek be a felhasználói bemenetekbe vagy lekérdezésekbe, és ez lehetővé teszi a támadók számára, hogy manipulálják és futtassák a nem kívánt strukturált lekérdezési nyelvet vagy SQL parancsokat az alkalmazás adatbázisában
  - egy támadó rosszindulatú adatokat küld a rendszerbe, amelyet aztán egy parancs vagy lekérdezés részeként feldolgoznak, ami nem kívánt következményekhez vezet.
  - Bejelentkezéskor a felhasználónevet és a jelszót elküldi a weboldal az adatbázisba, és lekérdezi, hogy a felhasználónév és a jelszó megegyezik-e az ott tároltakkal. -> 
    - SQL utasítással: -> pl: Select * from Users where user_id = 'Jason' and password = 'Pass123'
    - Ha van egyezés, megkapjuk a hozzáférést
  - Code Injection: további információk vagy kód beillesztése egy adatbeviteli űrlapon keresztül egy ügyféltől egy alkalmazásba.
    - Code injection egy általános forma, SQL injection egy speciális típus
  - SQL injection támadás: egy SQL-lekérdezés befecskendezéséből áll a beviteli űrlapon keresztül, amelyet az ügyfél arra használ, hogy adatokat küldjön egy webes alkalmazásnak.
    - SQL injektáláskor a támadó megpróbál paramétereket vagy kódot beilleszteni az SQL utasításba, amelyet az adatbázis lekérdezéséhez használnak.
    - A támadó vagy URL paraméterként adja be a bemenetét egy űrlapmezőbe való beírással, 
    - vagy a cookie-k módosításával 
    - POST adatok megváltoztatásával
    - HTTP-fejléc segítségével
  - Könnyen automatizálható, sok eszköz van ehhez, amelyek SQL injection-re és kishasználásokra összpontosít
  - Kihasználása:
    - Űrlapmezőben: 
      - felhasználónévhez az a felhasználó, akivel be akarok jelentkezni -> pl. Jason
      - jelszó: támadóként nem ismerem a jelszót -> beírom: 'OR 1=1;
      - ekkor a form adatai bekerülnek a backend SQL utasításában, majd lekérdezik az adatbázist.
      - Teljes lekérdező parancs ez lesz: Select * from Users where user_id = 'Jason' and password = ''OR 1=1;' -> hozzáférés engedélyezett
      - ': escape karakter
      - amit jelszóként beírtunk kiértékeli, hogy egyezik-e Jason jelszavával, VAGY 1=1-gyel -> 1 mindig egyenlő 1-el!
    - Megakadályozása:
      - Use input validation - bemeneti érvényesítés
      - Sanitize date - felhasználóktól kapott adatok szanálása
      - Use a web application firewall - webes alkalmazás tűzfal használata az ügyfél és webkiszolgáló közé helyezve, alkalmas elvégezni előző 2-t
- XML injection:
  - Extensible Markup Language (XML) - Bővíthető jelölőnyelv
  - A webalkalmazások hitelesítésre, engedélyezésre vagy más típusú adatcserére használják.
  - Ügyéltől a kiszolgálóhoz, vagy egyik kiszolgálótól a másikhoz kerülnek.
  - XML-adatok szállítás közbeni védelme érdekében azokat mindig titkosított alagúton belül kell küldeni pl. TLS Tunnel használatával
  - Kiszolgáló védelme érdekében:
    - Input Validation
    - Input Sanitization
  - Ha **titkosítás vagy bemeneti érvényesítés** nélkül küldünk XML-adatokat, akkor azok sebezhetőek lesznek:
    - Snooping (szimatolás)
    - Spoofing (hamisítás)
    - Request forgery (kéréshamisítás)
    - Injection of arbitary code (tetszőleges kódbevitel)
  - XPath injectionnek is nevezik
  - Olyan biztonsági sebezhetőség, amely az XML-adatokat vagy bővíthető jelölőnyelvi adatokat feldolgozó webes alkalmazásokat célozza
  - A támadás során a támadó manipulálhatja az XML-bemeneteket, hogy kihasználja az alkalmazás XML-elemző vagy feldolgozó mechanizmusainak sebezhetőségeit. Ez aztán jogosulatlan hozzáféréshez, adatfeltáráshoz vagy más rosszindulatú műveletekhez vezethet az adott webes alkalmazáson belül.
  - XML példa korábbi jegyzetekből
  - XML exploitok:
    - XML Bomb (Billion Laughs Attack): egy XML fájlt vesz, majd kódolást használ az entitások kódolására és exponenciális méretűvé bővítésére, ami a tárhelyen memóriát fogyaszt és potenciálisan összeomolhat. 
      - Úgy működik mint egy bomba vagy szolgáltatásmegtagadási támadás
      - egymilliárd lol az entitás hivatkozások faktoriális jellege miatt
      - Ez akár 3 GB-nyi memóriát is foglalhat az XML-fájlon belüli ismétlődések miatt
      - Ha egy támadó hozzáfér a szerverhez, és feldolgozza az alábbi XML-fájlt, akkor elkezdheti fogyasztani az összes erőforrást a webszerverünkön -> XML bomba

```
<?xml version="1.0"?>
<!DOCTYPE lolz [
<!ENTITY lol "lol">
<!ELEMENT lolz (#PCDATA)>
<!ENTITY lol1 "&lol;&lol;&lol;&lol;&lol;&lol;&lol;&lol;&lol;&lol;">
<!ENTITY lol2 "&lol1;&lol1;&lol1;&lol1;&lol1;&lol1;&lol1;&lol1;&lol1;&lol1;">
<!ENTITY lol3 "&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;">
<!ENTITY lol4 "&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;">
<!ENTITY lol5 "&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;">
<!ENTITY lol6 "&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;">
<!ENTITY lol7 "&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;">
<!ENTITY lol8 "&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;">
<!ENTITY lol9 "&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;">
]>
<lolz>&lol9;</lolz>
```

    - XML External Entity (XXE) támadás: egy helyi erőforrás iránti kérés beágyazására tesz kísérletet.
      - Az alábbi kódban az XML-egység egy Linux-gép shadow fájlját próbálja beolvasni, amely a rendszer fiókjainak password hash-eit tartalmazza
      - Megelőzés: Input validation
      - XML Vulnerability, XML Exploitation, XML Injection: XML sebezhetőség, amelyet kihasználnak

```
<?xml version="1.0" encoding="ISO-8859-1"?>
<!DOCTYPE foo [
  <!ELEMENT foo ANY>
  <!ENTITY xxe SYSTEM "file:///etc/shadow">
]>
<foo>&xxe;</foo>
```

- Bármikor, amikor a felhasználó bevitele történik, legyen az URL, fájl, mező bevitele egy weboldalon, vagy valamilyen XML-adat átküldése, sok biztonsági problémát megelőzhetünk ha csak bemeneti érvényesítést használunk.

### Cross-site scripting (XSS)

- Olyan webes biztonsági sebezhetőség, ahol egy rosszindulatú szkriptet juttatnak be egy olyan weboldalba, amelyet más felhasználók néznek, jellemzően egy felhasználó által generált tartalom segítségével, hogy jogosulatlan műveleteket hajtsanak végre a böngészőjükben.

### Cross-site request forgery (XSRF)

- Webes biztonsági kihasználás, a támadó arra összpontosít, hogy megpróbálja becsapni a felhasználót, hogy tudtán kívül, beleegyezése nélkül hajtson végre egy műveletet egy másik weboldalon, hogy potenciálisan nem szándékos vagy káros műveleteket hajtson végre a felhasználó kontextusában az adott weboldalon.

### Buffer Overflow

- Egy olyan szoftveres sebezhetőség, amely akkor fordul elő, amikor egy program több adatot ír egy memóriapufferbe, mint amennyit az a memóripuffer elbír, és ez potenciálisan lehetővé teszi a rosszindulatú kód számára a szomszédos memória felülírását, majd tetszőleges parancsok végrehajtását vagy a program összeomlását.

### Race Conditions - Versenyfeltételek

- A Race Condition egy olyan szoftveres sebezhetőség, amely akkor lép fel, amikor egy párhuzamos rendszerben több folyamat vagy szál egyszerre próbál hozzáférni egy megosztott erőforráshoz vagy adathoz. Ez pedig a végrehajtás időzítése és sorrendje miatt kiszámíthatatlan és nem szándékos eredményekhez vezethet.
- Fogalmak:
  - Time of Check - Ellenőrzés ideje
  - Target of Evaluation - értékelés célja
  - Time of Use - használat ideje

## Section 19 Malicious Activity

- Distributed Denial Service (DDoS) - Elosztott szolgáltatásmegtagadási támadások
  - Denial of Service Attack - szolgáltatásmegtagadásos támadások
  - Amplified Distributed Denial of Service - erősített elosztott szolgáltatásmegtagadásos támadások
  - Reflected Distributed Denial of Service - reflektált elosztott szolgáltatásmegtagadásos támadások
  - Elkerülés és megállítás módjai
- Domain Name Server (DNS) Attacks - tartománynévkiszolgáló-támadások
  - DNS cache poisoning - DNS cache mérgezés
  - DNS amplification attacks - DNS-erősítési támadások
  - DNS tunneling - DNS alagút
  - Domain hijacking - tartomány eltérítés
  - DNS zone transfer attacks - DNS-zónaátviteli támadások
- Directory Traversal Attacks/Path Traversal - könyvtár áthaladási támadás, útvonal áthaladás magában foglalja a felhasználó által megadott bemeneti fájlnevek elégtelen biztonsági érvényesítésének vagy szanálásának magyarázatát.
- Privilege Escalation Attacks - jogosultság-emelkedési támadások: a hálózati behatolás azon típusa, amely a rendszer sebezhetőségének kihasználásával olyan erőforrásokhoz való magasabb szintű hozzáférést tesz lehetővé, amelyek normális esetben védettek egy alkalmazással vagy felhasználóval szemben
- Replay Attacks - visszajátszási támadások: az érvényes adatátvitel rosszindulatú vagy csalárd megismétlését vagy késleltetését jelentik. A támadó elfogja az adatátvitelt, majd újra továbbítja azt.
- Session/Cookie/Session Key Hijacking - Munkamenet eltérítés: a támadó átveszi a felhasználói munkamenetet. A támadó egy érvényes számítógépes munkamenetet kihasználva jogosulatlan hozzáférést szerezhet a számítógépes rendszerben lévő információkhoz vagy szolgáltatásokhoz.
- Malicious Code Injection Attacks - rosszindulatú kódinjektálási támadások: támadások széles csoportja, ahol a támadó káros kódot juttathat be egy programozói rendszerbe, hogy az nem kívánt módon viselkedjen.
- Identify Indicators of Compromise (IoC) - Kompromittáltság jelzői
  - fiókok zárolása
  - egyidejű munkamenet-használat
  - blokkolt tartalom
  - impossible travel - lehetetlen utazás
  - erőforrás-fogyasztás
  - erőforrások hozzáférhetetlensége
  - cikluson kívüli naplózás
  - dokumentumok közzététele
  - feltörték
  - hiányzó naplófájlok

## Section 21 Security Techniques

- Wireless Infrastructure Security - számos biztonsági kihívás
- Wireless Security Settings - wireless biztonsági beállítások
  - WPA3
  - AAA
  - RADIUS
  - kriptográfiai protokollok
  - hitelesítési protokollok
- Application Security
  - bemeneti érvényesítés
  - biztonságos cookie-k
  - statikus kódelemzés
  - dinamikus kódelemzés
  - kódaláírás
  - sandboxing
- Network Access Control (NAC) - hálózati hozzáférés-szabályozás: biztonsági megoldás, amely házirendeket érvényesít a hálózatban lévő eszközökr és felhasználókra.
  - Célja, hogy megvédja a hálózatokat a potenciális fenyegetésektől azáltal, hogy korlátozza a hálózati erőforrások elérhetőségét a végponti eszközök és felhasználók számára.
- Web and DNS filtering - Web és DNS szűrés
  - ügynök-alapú webszűrőkkel, 
  - központosított proxyk
  - URL-szkennelés
  - tartalom kategorizálása
  - blokkolási szabályokkal
  - reputation - hírnév
- Email Security
  - Protokollok
    - DMARC,
    - DKIM
    - SPF
    - átjáró protokoll
  - spamszűrési technikák
- Endpoint Detection and Response (EDR) - végpontok észlelése és reagálása: kiberbiztonsági technológia, amely folyamatosan figyeli és gyűjti a végponti eszközök, pl számítógépek, táblagépek vagy okostelefonok adatait, hogy azonosítsa, kivizsgálja és megelőzze a potenciális kiberbiztonsági fenyegetéseket
- User behavior Analytics - felhasználói viselkedéselemzés: egy olyan folyamat, amely a gépi tanuláson alapuló adatelemzést és a felhasználói viselkedésmintákat használja fel a rendszerben vagy hálózatban zajló, potenciálisan káros tevékenységek azonosítására
  - Normál viselkedés alapvonalának meghatározásával az UBA-rendszerek képesek észlelni az anomáliákat vagy eltéréseket
- Selecting Secure Protocols - biztonságos protokollok kiválasztása
  - protokoll kiválasztása
  - szállítási módszerek kiválasztása


---

- [ ] [CompTIA Security+ (SYO-701) Complete Course & Exam - Dion Training Solutions](https://www.udemy.com/course/securityplus/learn/lecture/40331142?start=15#content)