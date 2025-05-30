# Cyber Secure Coder (CSC-110) Videó

## 1. Biztonság a szoftverben

### 1.1. Áttekintés

- Justin Dennison, Daniel Lowrie bemutatkozás
- Pearson tanúsítvány információk

### 1.2. Előzetes ismeretek és elvárások

- Identifying the Need for Security in Your Software Projects (
A biztonság iránti igény azonosítása szoftverprojektjei során)
- Handling Vulnerabilities (Sebezhetőségek kezelése)
- Designing for Security (Biztonsági tervezés)
- Developing Secure Code (Biztonságos kód fejlesztése)
- Implementing Common Protections (Közös védelmek megvalósítása)
- Testing Software Security (Szoftverbiztonság tesztelése)
- Maintaining Security in Deployed Software (A telepített szoftver biztonságának fenntartása)

### 1.3. Gather Software Requirements (Gyűjtsd össze a szoftverkövetelményeket)

- szoftverkövetelmények, biztonsági követelmények
- felhasználói követelmények
- platformkövetelmények
- vállalkozás esetén -> üzleti követelmények (1.3. videó, 5:35) -> gyakran változhatnak, ha nem jól meghatározottak -> fontos lenne jól meghatározni
- vízesés modell - nehéz visszaadni, miután elkészült és már a tesztelési fázisban van.
- iteratív ciklusokkal - korábban kiderül a probléma, könnyebben javítható

![1.3.](img/1.3.png)

- szabványok és megfelelések (1.3. videó, 6:34)
  - HIPAA https://hu.wiktionary.org/wiki/HIPAA
  - PCI DSS: Payment Card Industry Data Security Standard – a kártya-műveletekkel kapcsolatos adatvédelmi biztonsági szabályok, amelyek a https://www.pcisecuritystandards.org/ honlapon érhetők el. A kereskedő köteles részletesen megismerni a PCI DSS-t és betartani a benne foglalt szabályokat. https://www.pcisecuritystandards.org/document_library/?document=pci_dss
  - FERPA
  - keretrendszerek
- Felhasználói elvárások -> gyorsan változnak (1.3. videó, 8:48)
  - vízesés gyenge pontja: könnyebb, ha valaki megmondja mit nem szeret, mint hogy mit szeret
  - bejelentkezés 
    - SSO: Az SSO a Single Sign-on rövidítése, amely egy hitelesítési séma, amely lehetővé teszi a felhasználók számára, hogy több szoftverrendszerbe is bejelentkezzenek egyetlen identitással. Ez azt jelenti, hogy a felhasználók egyetlen bejelentkezési hitelesítő adatokkal jelentkezhetnek be több rendszerbe.
    - felhőalapú felhasználás
  - proaktívnak kell lenni
- Platform követelmények (1.3. videó 9:43)
  - On-premise, helyi alkalmazás
  - felhőhöz csatlakozik, AWS, Azure, GCP
- Consequences of Not Meeting Security Requirements (1.3. videó, 10:50)

### 1.4. Feladat: Követelmények meghatározása

### 1.5. Tevékenység: Követelmények meghatározása

- alkalmazás fejlesztése
  - katalógus a termékekről, termékleírással képekkel, árral
  - több nyelven
  - keresni tudnak a felhasználók kulcsszavakra
  - új felhasználók regisztrálnak felhasználói fiókot
    - termékek online vásárlása
    - visszajelzések
    - bejelentkezés Google-ön keresztül OAuth autentikálással
  - adminisztrátor kezeli a felhasználói fiókokat
- felhasználók elvárási adatvédelem terén
- fizetések kezelése -> PCI, GDPR

### 1.6. A szoftverbiztonságot aláásó tényezők

- Szoftverbiztonság 3P-je (videó: 1:40)
  - **Product**
    - common defects harm security (a gyakori hibák rontják a biztonságot)
    - components and platforms are not secure (az alkatrészek és a platformok nem biztonságosak)
    - configuration of software and host system is not secure (a szoftver és a gazdarendszer konfigurációja nem biztonságos)
    - security policies are poorly implemented (a biztonsági politikákat rosszul hajtják végre)
  - **People**
    - operator error
    - incorrect assumptions about software behavior (helytelen feltételezések a szoftver viselkedésével kapcsolatban)
    - Falling prey to attacks (A támadások áldozatává válás)
    - unintentional unsecure behavior (nem szándékos bizonytalan viselkedés)
    - malicious behavior (rosszindulatú viselkedés)
    - nem bízhatunk meg a felhasználókban
      - lehetnek rosszindulatúak
      - nem biztos, hogy tudják mit kell csinálniuk
  - **Process**
    - security is not integrated into the entire process (a biztonság nem integrálódik a teljes folyamatba)
    - overall design is unsecure (az általános kialakítás nem biztonságos)
    - software and deployments are not maintained adequately (a szoftverek és a telepítések karbantartása nem megfelelő)
    - development tools don't promote security (A fejlesztési eszközök nem támogatják a biztonságot)
- Program készítésekor át kell gondolni, hogyan mennek rosszul a dolgok. Hogyan támadnának meg, hogyan védhetem meg az alkalmazásom?
- Dokumentáció -> oktatni az embereket
- Kódelemzés, CI (A szoftverfejlesztés területén a folyamatos integráció (CI: continuous integration) az a fejlesztési folyamat, amikor a fejlesztők a munkájuk másolatát naponta akár többször is megosztják a verziókezelő rendszerben).

### 1.7. Szoftver sebezhetőségek és támadási fázisok

- Hacking: nem feltétlenül rossz, csak "bütykölőt" jelent, trükközést
  - White hat
  - Black hat
  - Gray hat
- Másképp
  - Builder
  - Breaker
    - felmér és értékel
    - kihasznál és behatol
    - fenntartja a hozzáférést vagy kiterjeszti a jogosultságokat
    - lebontsa az egészet (Denial of service - DOS)

### 1.8. Támadási minták

- Hogyan támadná meg valaki, hogyan törné meg? Hogyan védekezhetek ellene? -> Megfelelő gondolkodásmód
- **Reconnaissance (Felderítés, felmérés, feltárás)**: milyen webalkalmazást futtat, verziószámok stb. Információgyűjtés ezekről, URL piszkálás, URL-be beírogatás, nyitott portok keresése stb. Minden lehetséges információ összegyűjtése a sebezhetőségek felderítéséhez és kihasználásához. Fontos. -> Nem szabad információt adni, ha nem muszáj -> nem tűnik rosszindulatú tevékenységnek, ha nincs naplózás vagy hozzáférési minták nyomon követése.
  - **Excavation (kiásás)**: 
    - a célpont utáni kutatás, információk kiásása (Kukucskálj bele a célpontba, hogy "kiásd" az információkat)
    - Tartalmazza az URL-ek és lekérdezési karakterláncok vizsgálatát és módosítását (webes alkalmazásban), a konfigurációk és beállítások módosítását, a weboldalak forrásainak megtekintését, a rendszernaplók felfedezését és egyebeket
    - Tartalmazza a visszaélési taktikákat, például érvénytelen vagy nem szokványos bemeneti értékek megadását a hibák kikényszerítésére, a kezeletlen kivételek felfedésére, valamint a bőbeszédű hibaüzenetek, veremnyomok, konfigurációs adatok, útvonalak és így tovább felfedésére.
  - **Footprinting**:
    - Keressen olyan konfigurációs információkat, amelyek hasznosak lehetnek egy támadásnál - nyitott portok, verziószámok, network topology információk, stb.
  - **Fingerprinting**: 
    - hasonlítsa össze a rendszer kimenetét az ismert "ujjlenyomatokkal", amelyek egyedileg azonosítják a rendszer részleteit
  - **Reverse Engineering**: 
    - Elemezhetem-e egy objektum, erőforrás vagy rendszer szerkezetét, funkcióját és összetételét annak megállapítására, hogyan épült fel vagy hogyan működik?
    - A cél általában az, hogy a funkcionalitás egészét vagy egy részét megkettőzze
  - **Functionality Misuse** - Funkcionalitás visszaélés
    - Visszaélhetek az alkalmazás funkcióival negatív műszaki hatás elérése érdekében?
    - A rendszer funkcióit nem változtatják vagy módosítják, hanem egyszerűen olyan módon használják, amilyennek nem szánták. Ez gyakran a funkcionalitás túlzott használatával vagy a hibás funkciók kihasználásával valósul meg, amelyek lehetővé teszik a visszaélést.
- **Gain Access Privileges** - hozzáférési jogosultságokat szerezni
  - **Brute force attacks**: 
    - gyorsan és ismételten beírja a különböző titkos értékeket, amíg a keresés fel nem oldja a hozzáférést
    - A titkos érték lehet jelszó, titkosítási kulcs, adatbázis-keresési kulcs vagy más olyan érték, amelyet a jogos felhasználónak ismernie kell.
    - tényezők, amelyek lehetővé teszik a sikeres támadást
      - kevesebb variáció a titkos értékben (pl. 8 karakter használata 16 helyett)
      - Használjon olyan mintákat (például valós világot), amelyek a szótárban kereshetők
      - a sikertelen próbálkozások gyors átfutása
  - **Authentication abuse**
    - jogosulatlan hozzáférést kaphat a hitelesítési könyvtár vagy annak használatának gyengesége miatt.
    - a hibás szoftverek feltételezéseket tehetnek a bizalmi kapcsolatról vagy a titkos értékek létrehozásáról, amelyek lehetővé teszik a támadó számára, hogy gondos lépéssorozat végrehajtásával hozzáférjen.
  - **Authentication bypass**
    - Kiváltságos hozzáférés megszerzése a normál hitelesítési útvonalon kívül.
    - példa: Miután a felhasználók bejelentkeznek, egy rosszul megtervezett webhely általában betölt egy adott URL-t, hogy érzékeny tartalmat tartalmazó oldalt jelenítsen meg. A támadó ezt az URL-t közvetlenül a címsorba írja be, hogy hitelesítés nélkül közvetlenül a biztonságos tartalomhoz juthasson.
- **Memory manipulation**: Olvashatok vagy írhatok adatokat egy memóriahelyre oly módon, hogy az aláássák a biztonságot?
  - **Buffer manipulation**
    - Adatok olvasása vagy írása egy memóriahelyre szokatlan módon, amely lehetővé teszi a támadó számára, hogy azon kívül is olvasson vagy írjon adatokat.
    - Célozza meg a memóriahelyeket, ne pedig azt a kódot, amelyik beolvassa vagy írja azokat.
    - Általában a támadás során a memóriába helyezett tartalom nem számít. A tipikus puffertámadás kiszorítja a pufferben tárolt eredeti tartalmat, ami egy másik memóriahely olvasását vagy felülírását eredményezi.
  - **Pointer manipulation**
    - A pointerváltozók értékeinek módosítása a nem kívánt memóriahelyek eléréséhez.
    - Ez hozzáférést biztosíthat olyan adatokhoz vagy funkciókhoz, amelyek normál esetben nem lennének elérhetők
- **Parameter Injection**
  - Módosíthatom a kérésparaméterek tartalmát a biztonság aláásása érdekében?
- **Input Data Manipulation**
  - Megadhatok-e fájlt vagy egyéb bemeneti adatokat unortodox formában a biztonsági védelem megkerülésére?
- **Action Spoofing**
  - Elrejthetem-e, álcázhatom-e az egyik műveletet a másiknak, és ezáltal rávehetem-e a felhasználót, hogy egyfajta műveletet kezdeményezzen, amikor egy másik műveletet szándékozik kezdeményezni?
  - Példa: Egy webalkalmazás felhasználója kiválaszt egy Küldés feliratú gombot, de lekérdezés helyett letölti a szoftvert a felhasználó számítógépére. Ezt meg lehet valósítani a clickjacking segítségével, amelyben a felhasználó látja az egyik felületet, de valójában egy másik, láthatatlan felülettel lép kapcsolatba.
- **Software Integrity Attack**:
  - Rábírhatok-e egy felhasználót, programot, kiszolgálót vagy eszközt olyan műveletekre, amelyek aláássák a szoftverkód, az eszköz, az adatszerkezetek vagy az eszköz firmware-ének integritását?
  - Azt eredményezi, hogy a célpont nem biztonságos állapotba kerül, ami felhasználható egy következő támadás előkészítésére.
- **Infect the Application with Malicious Code**:
  - Hozzáadhatom saját rosszindulatú kódomat vagy erőforrásaimat az alkalmazáshoz?
  - A támadók különféle technikákat használhatnak arra, hogy saját rosszindulatú kódjukat hozzáadják egy futó alkalmazáshoz.
    - **Code inclusion**
    - **Code injection**
    - **Command injection**
    - **Content spoofing**
    - **Resource location spoofing**
  - **Denial of Service**
    - Elvégezhetek bizonyos műveleteket, amelyek megakadályozzák a jogos felhasználókat a szoftver használatában?
    - A szolgáltatás megtagadása többféle megközelítéssel is megvalósítható, amelyek közvetlenül letiltják a szolgáltatásokat, vagy annyira leblokkolják a rendszert, hogy az már nem tudja támogatni a szolgáltatást.
      - Excessive allocation - Túlzott elosztás
      - Flooding - elárasztás
      - Resource leak exposure - Erőforrás-szivárgás expozíció
      - Sustained client engagement - Tartós ügyfélelköteleződés
  - **Repudiation** - Megtagadás, elutasítás:
    - Lebonyolíthatok-e tranzakciót, de úgy tehetem, hogy a rendszer ne tudja bizonyítani, hogy a tranzakció valóban megtörtént?
    - Akkor fordul elő, ha a rendszer nem követi megfelelően és nem naplózza megfelelően a felhasználók műveleteit, vagy nem védi a naplókat.
    - A támadó manipulálhatja a rendszert, hogy hibás adatokat naplózzon, és úgy tűnik, hogy a tranzakció nem történt meg, vagy más típusú tranzakció történt.
    - Példa: A támadó képes lehet hitelkártyás vásárlást végrehajtani, miközben lehetetlenné teszi a rendszer számára annak bizonyítását, hogy a vásárlás egy adott kártyaszámmal történt.
- **Megelőzés**: 
  - Sanitized - fertőtlenítés
    - Szűrés: nem használhat pontosvesszőt, nem használhat csőoperátorokat vagy & jeleket
    - Karakterkorlát

### 1.9. Feladat - Sebezhetőségek keresése

### 1.10. Sebezhetőségek keresése

### 1.11. Feladat Új jelszókövetelmények

### 1.12. Új jelszókövetelmények

### 1.13. Feladat Jelszavak hash-elése

- Soha nem tárolhatók jelszavak plain-textben!!!
- sha256 hashelési algoritmus
- Salt: sózás -> véletlenszerű karakterkészlet hozzáadva a jelszóhoz hash-elés előtt. Só hozzáadása => hash-elés

### 1.14. Jelszavak hash-elése

- md5 nem túl robosztus, könnyen feltörhető szivárványtáblával
  - hash ütközési problémák
  - nem javasolt a használata jelszavak tárolásához
  - checksumhoz kiváló (ellenőrző összeg)
- sha512 ajánlott
- salt hard code (kemény kódolás - változóban tárolva mindenkinek ugyanaz) -> nem jó -> ha ezt valahogy megszerzik szivárványtáblával szintén megszerezhetők az információk (brute force)
- salt tárolása: adatbázisban a jelszó hash-sel, mindenkinek más -> kriptográfiailag biztonságos só generálása mindenkinek -> ezt kell tenni egy **hitelesítési rendszerben**
- jelszó megadásakor azt újra hash-eljük, és összehasonlítjuk a tárolt jelszó hash-sel.
- Soha nem szabad plain textet hasonlítani plain texthez -> hash-eket kell hasonlítani
- hash algoritmusok
  - sha256
  - sha384
  - sha512
  - blake2b
  - blake2s
- Pythonban pbkdf2_hmac algoritmusnak megadható (python dokumentációban)
  - hash név
  - password
  - salt,
  - iterációk: teljesítménytől függ, (100.000, 1.000.000)
  - dklen: származtatott kulcs néhány bit hosszúságból

#### Python példa:

  ```
  def GeneratePasswordHash(password, SALT):
    try:
      import binascii
      dk = hashlib.pbkdf2_hmac('sha512', password, SALT, 100000)
      return True, binascii.hexlify(dk)
    except:
      return False, "Hashing Failure"
  ```

  hibát okozhat Pythonban

  ```
  def GeneratePasswordHash(password, SALT):
    import binascii
    dk = hashlib.pbkdf2_hmac('sha512', password.encode(), SALT.encode(), 100000)
    return True, binascii.hexlify(dk)
  ```



- Mi az oka, hogy még mindig sokan használnak elavult, nem biztonságos megoldásokat?
  - kezdők nem ismerik
  - lustaság, fejlesztőként nem adunk hozzá funkciókat, amire nem lesz szükség -> biztonság kivétel ez alól
  - ha szerződésben nincs rögzítve a jelszavak hash-elése, a fejlesztók 60%-a plain-textben tárolja -> pedig tulajdonképpen csak függvényhívás (olyanokat kell használni, amelyek tesztelve vannak, alaposan kutatott, bizonyított hashelési módszerek)
  - Ha gyorsabbá kell tenni a bejelentkezést -> csökkentik a biztonságot
- 

### 1.15. Sebezhetőségi intelligencia

- Információforrások a szoftverprojektjeit érintő sebezhetőségekről:
  - Általában ingyenesen használhatók (Are typically free to use)
  - Előfizetésen keresztül értesítheti Önt (például RSS hírfolyamokon vagy e-mail listákon) (May notify you through subscription (RSS feeds or email lists, for example))
- Ügyeljen arra, hogy figyelje a projektjei által használt összes szoftver információforrását:
  - Platformok
  - Alkalmazásokká összeállított modulok (Modules complied into applications)
  - Alkalmazáson kívüli modulok, de ez a futtatás ugyanaz a folyamatterület (Modules external to application, but that run is same process space)
  - Helyi külső API-k, amelyeket az alkalmazás hív meg (Local external APIs your application calls)
  - Web- és felhőszolgáltatások, amelyeket az alkalmazás hív (Web and cloud services your application calls)
- Lépést kell tartani a függőségek sebezhetőségeivel például NPM -> a függőségeknek is vannak függőségeik... -> örökölhetünk sebezhetőségeket -> ezek a sebezhetőségek (vulnerabilities) kizsákmányolásokhoz vezethetnek (exploits).
- Valós eljárások, kódok vagy végrehajtható fájlok, amelyek kihasználják a sebezhetőségeket (Actual procedures, code, or executables that take advantage of vulnerabilities)
- Elősegítheti a szoftverprojektjein végzett tesztek egy részét. (May drive some of the tests you perform on your software projects.)
- Bizonyos helyzetekben illegális vagy veszélyes lehet kísérletezni (legyen óvatos!) (May be illegal or dangerous to experiment with in some situations (Be careful!))
- Ellenőrzött környezetben kell kísérletezni. (Should be experimented with in a controlled environment.)
- A weben különböző forrásokból szerezhető be. (May be obtained through various sources on the web.)
  - Examples
    - Offensive Security databes: https://www.exploit-db.com
    - Common Exploits at http://www.commonexploits.com
- Sebezhetőségi adatbázisok (Vulnerabilities databases)
  - Különféle kormányzati és kereskedelmi szervezetek adják ki (Published by various government and commercial organizations)
  - Nem mindig tartalmazza a legfrissebb információkat, de általában igen (Do not always contain the latest information, but are generally)
    - Átfogó (Comprehensive)
    - Tartalmaz keresési lehetőségeket (Include search capabilities)
    - Automatikusan kereshető fejlesztési automatizálási szkriptekkel (Can be searched automatically by development automation scripts)
    - Lehet benn POC (Proof of concept - részletes leírás, hogy használható ki a sebezhetőség)
  - National Vulnerability Database
    - https://nvd.nist.gov
    - The U.S government's repository of vulnerability management data.
    - A Security Content Automation Protocol (SCAP) által meghatározott géppel olvasható formátumban tartva. (Maintained in the machine-readable format specified by the Security Content Automation Protocol (SCAP))
    - Tartalmazza a biztonsági ellenőrzőlisták adatbázisait, a biztonsággal kapcsolatos szoftverhibák hibás konfigurációit, a termékneveket és a hatásmérőket. (Includes databases of security checklists, security-related software defects misconfigurations, product names, and impact metrics.)
  - Offensive Security's Exploit Database
  - https://www.exploit-db.com/
  - A kihasználások és a sebezhető szoftverek kereshető archívuma, CVE formátumban. (A searchable archive of exploits and vulnerable software, supplied in the CVE format.)
- Command Attack Pattern Enumeration and Classification (CAPEC)
  - https://capec.mitre.org
  - Maintained by MITRE Corporation (A MITRE karbantartója)
  - A list of common attack patterns
- OWASP Top 10
  - https://www.owasp.org/index.php/Category:OWASP_Top_Ten_Project
  - Maintained by Open Web Application Security Project (OWASP)
  - A list of common threats and strategies for countering them. (A gyakori fenyegetések listája és a leküzdésük stratégiái.)
  - Owasp provides many other resources
- CWE/SANS Top 25 Most Dangerous Software Errors
  - https://cwe.mitre.org/top25
  - Maintained by the SANS Institute, working with MITRE and other organizations
  - A list of the most widespread and critical software errors that can lead to serious vulnerabilities in software. (A legelterjedtebb és legkritikusabb szoftverhibák listája, amelyek súlyos szoftver sérülékenységekhez vezethetnek.)
  - Overlaps the OWASP Top 10, and the CWE website provides a comparison to the OWASP Top 10 (Átfedi az OWASP Top 10-et, és a CWE webhely összehasonlítást nyújt az OWASP Top 10-hez)
  - While OWASP focuses on web and mobile apps, CWE/SANS tends to cover all types of software, include desktop applications.
- Biztonsági közlemények és tanácsok (Security bulletins and advisories)
  - Published by vendors of systems, application runtime environments, frameworks, web browsers, and other platforms and tools you use in your software projects. (Rendszerek, alkalmazás-futási környezetek, keretrendszerek, webböngészők és egyéb, a szoftverprojektjeiben használt platformok és eszközök szállítói által közzétéve.)
  - Provide the most comprehensive and timely source of vulnerability and exploit information for the technologies they cover. (A sebezhetőség legátfogóbb és legidőszerűbb forrása, és az általuk lefedett technológiákkal kapcsolatos információk kihasználása.)
  - Microsoft Security Bulletins https://technet.microsoft.com/en-us/security/bulletins.aspx
  - Apple Security Updates https://support.apple.com/en-us/HT201222
  - Android Security Bulletins https://source.android.com/security/bulletin/
  - Ubuntu Security Notices https://www.ubuntu.com/usn/
  - Amazon Web Services Latest Bulletins https://aws.amazon.com/security/security-bulletins/
  - jQuery Updates Blog https://blog.jquery.com
  - Chrome Releases https://chromereleases.googleblog.com
- Open source software project issue trackers
  - Legfrissebb információkkal szolgál a frissítésekről és a folyamatban lévő problémákról
  - Examples:
    - Node.js https://groups.google.com/forum/#forum/nodejs-sec
    - Python Bug Tracker https://bugs.python.org/
    - Hadoop Issue Tracking https://hadoop.apache.org/issue_tracking.html
    - MySQL Bugs https://bugs.mysql.com
    - Docker Issues https://github.com/docker/docker/issues
- "Vulnerability is the capacity to exploit something" (A sebezhetőség valaminek a kihasználásának a képessége.)

### 1.16. Vulnerablity Search - Feladat

- Attacking various websites and applications yourself (Különféle webhelyek és alkalmazások saját maga megtámadása)
  - One of the best ways to gain experience with common vulnerabilities (Az egyik legjobb módja annak, hogy tapasztalatokat szerezzen a gyakori sebezhetőségekkel kapcsolatban)
  - Probably illegal (Valószínűleg illegális)
  - Will annoy system operators and users (Zavarja a rendszerüzemeltetőket és a felhasználókat)
- A legal more polite alternative - use example applications and websites expressly provided for this purpose (Jogilag udvariasabb alternatíva – használjon példaalkalmazásokat és kifejezetten erre a célra szolgáló weboldalakat)
  - OWASP Juice Shop Project - Used in this course provide the "Woodworker's Wheelhouse" online store catalog
  - OWASP Vulnerable Web Applicatons Directory Project
  - 15 Vulnerable Sites To (Legally) Practice Your Hacking Skills - 2016 Update (https://www.checkmarx.com/ ...)
  - 40+ Intentionally Vulnerable Websites To (Legally) Practice Your Hacking Skills (https://www.bonkersabouttech.com/security/ ...)
  - Penetration Testing Practice Lab - Vulnerable Apps/Systems (https://www.amanhardikar.com/mindmaps/Practice.html)
- Woodworkers Wheelhouse
  - Serves as the "setting" for activities in this course
  - Imaginary company that sells hardwood lumber, tools, and other supplies for woodworkers and other hobbyists, as well as some home improvement and interior decorating supplies
- You will work on a web-based application for Woodworkers Wheelhouse
  - Includes a product catalog from which customers can order products online, and various other features.
  - Prototype app started by another developer.
  - Developed in:
    - Node.js version 6.10.3
    - Express.js
    - Angular.js
    - Bootstrap
    - Other web development frameworks
  - To begin, you will research Node.js on the web to identify and vulnerabilities in this version.

### 1.17. Vulnerablity Search - Tevékenység

- sanitize-html csomag a package.jsonban
- jsonwebtoken
- snyk.io-n Vulnerablity DB -> https://security.snyk.io/
- https://docs.npmjs.com/about-semantic-versioning
  - Using semantic versioning to specify update types your package can accept
You can specify which update types your package can accept from dependencies in your package's package.json file.

For example, to specify acceptable version ranges up to 1.0.4, use the following syntax:

Patch releases: 1.0 or 1.0.x or ~1.0.4
Minor releases: 1 or 1.x or ^1.0.4
Major releases: * or x
For more information on semantic versioning syntax, see the npm semver calculator.

Example: 

```
"dependencies": {
  "my_dep": "^1.0.0",
  "another_dep": "~2.2.0"
},
```

- Ellenőrizhetők automatizált eszközökkel -> pl. SonarQube https://www.sonarsource.com/products/sonarqube/
- Nagyobb frissítések elronthatják a program működését

## 2. Sebezhetőségek keresése

### 2.18. Szoftverhibák

- Szoftvernek és bugoknak is van életciklusa
  - Bugoknál, hibajelentés, javítás (remélhetőleg nem vezet be újabb hibákat) -> biztonsági problémák -> buffer overflow
  - Terms that describe software problems correspond to phases of the development process (A szoftverproblémákat leíró kifejezések a fejlesztési folyamat fázisainak felelnek meg)
    - **Error** - A mistake that someone makes when producing software (during design, programming, installation, configuration) (Hiba – Hiba, amelyet valaki a szoftver gyártása során követ el (tervezés, programozás, telepítés, konfigurálás során))
    - **Fault** - An error manifested within code. When you can point to a problem are in code that is leading to a security problem (a bug), you are identifying the fault. (Hiba – A kódon belüli hiba. Ha olyan kódban lévő problémára tud rámutatni, amely biztonsági problémához (hibához) vezet, akkor azonosítja a hibát.)
    - **Defect** - A deviation from requirements (resulting from a fault) - when something doesn't work the way it should, or doesn't live up to quality requirements. (Hiba – a követelményektől való eltérés (hiba miatt) – amikor valami nem úgy működik, ahogy kellene, vagy nem felel meg a minőségi követelményeknek.)
    - **Failure** - A real-world problem that occurs when a defect is released to customers. (Meghibásodás – Valós probléma, amely akkor jelentkezik, amikor a hibát kiadják az ügyfeleknek.)
- Security defects may be placed in code maliciously. (A biztonsági hibák rosszindulatúan helyezhetők el a kódban.)
- More often, they are simply due to a development mistake, such as:
  - A programming error
  - Mistaken or incomplete assumptions, such as:
    - The environment in which software will operate
    - How specific APIs or functions work
    - Access rights users will have
  - A change in the context in which te software runs
  - Using third-party code that is not secure
  - Bugs introduced through maintenance updates
- Build Security into your Design Processes
  - The stronger your design early on, the less code you will have to change later on.
  - To build security into your design processes:
    - Be sure that you understand what you are trying to build.
    - Identify the environment in which your software will run.
    - Identify the major modules in your software.
    - List all of the errors that might occur in various modules, and how you will deal with them
    - Resist adding features that are not driven by requirements
    - Adhere to secure coding standards for the languages and environments you use:
      - SEI CERT Oracle Coding Standard for Java
      - SEI CERT Android Secure Coding Standard
      - SEI CERT C Coding Standard
      - SEI CERT C++ Coding Standard
      - SEI CERT Perl Coding Standard
>- A biztonsági hibák rosszindulatúan helyezhetők el a kódban. (A biztonsági hibák rosszindulatúan helyezhetők el a kódban.)
>- Gyakrabban egyszerűen fejlesztési hibából adódnak, például:
> - Programozási hiba
> - Téves vagy hiányos feltételezések, például:
> - A környezet, amelyben a szoftver működik
> - Az egyes API-k vagy funkciók működése
> - A felhasználóknak hozzáférési joguk lesz
> - Változás a szoftver futási környezetében
> - Harmadik féltől származó, nem biztonságos kód használata
> - A karbantartási frissítéseken keresztül bevezetett hibák
>- Építsen be biztonságot tervezési folyamataiba
> - Minél erősebb a tervezés korai szakaszában, annál kevesebb kódot kell később módosítania.
> - A biztonság beépítése a tervezési folyamatokba:
> - Győződjön meg arról, hogy megérti, mit akar felépíteni.
> - Határozza meg a környezetet, amelyben a szoftver futni fog.
> - Határozza meg a szoftver főbb moduljait.
> - Sorolja fel az összes hibát, amely a különböző modulokban előfordulhat, és hogyan fogja kezelni őket
> - Ne adjon hozzá olyan funkciókat, amelyeket nem a követelmények vezérelnek
> - Tartsa be az Ön által használt nyelvekre és környezetekre vonatkozó biztonságos kódolási szabványokat:
> - SEI CERT Oracle kódolási szabvány Java számára
> - SEI CERT Android Secure Coding Standard
> - SEI CERT C kódolási szabvány
> - SEI CERT C++ kódolási szabvány
> - SEI CERT Perl kódolási szabvány

### 2.19. Külső könyvtárak

- Problem in standard libraries
  - Standard libraries
    - Provide classes, templates subroutines, macros, global variables, and other commonly used constructs
    - Are included with every implementation of a programming language
    - Are treated by developers almost as part of the programming language itself
    - Are used extensively by developers
    - May contain functions that are inheretly insecure or that can easily be used inappropriately in ways that make them unsecure
>- Probléma a szabványos könyvtárakban
> - Szabványos könyvtárak
> - Osztályokat, sablon alprogramokat, makrókat, globális változókat és egyéb gyakran >használt konstrukciókat biztosítanak
> - A programozási nyelv minden megvalósítása tartalmazza
> - A fejlesztők szinte a programozási nyelv részeként kezelik
> - A fejlesztők széles körben használják
> - Tartalmazhat olyan funkciókat, amelyek eredendően nem biztonságosak, vagy amelyek könnyen nem megfelelően használhatók olyan módon, hogy azok nem biztonságosak

- Pythonban néhány library technikailag third party -> sok ember erőfeszítése, remélhetőleg foglalkoznak a biztonsággal -> elolvasni hozzá a dokumentációt, biztonsági figyelmezetetéseket.
- Dependencies
  - Third party source code libraries:
    - Enable developers to develop faster, using functionally developed and tested by others
    - May in turn use third-party code, which would make it fouth-party code, from your perspective.
    - May be of very high quality, but you shouldn't simply assume that they will be.
    - Example:
      - OpenSSL Heartbleed vulnerability
  - You need to ensure that you are aware of all of the code dependencies
>- Függőségek
> - Harmadik fél forráskód-könyvtárai:
> - Lehetővé teszi a fejlesztők számára, hogy gyorsabban fejlesszenek, a funkcionálisan kifejlesztett és mások által tesztelt termékek használatával
> - Használhat harmadik féltől származó kódot, ami az Ön szemszögéből negyedik fél kódját eredményezné.
> - Lehet, hogy nagyon jó minőségűek, de nem szabad egyszerűen feltételezni, hogy azok lesznek.
> - Példa:
>  - OpenSSL Heartbleed sebezhetőség
>- Győződjön meg arról, hogy tisztában van az összes kódfüggőséggel
- Most developers don't have the time or experience to develop encryption that is better than what is provided in high-quality encryption libraries.
- Megfelelő titkosítási algoritmus választása! -> MD5 hash ütközési problémák
- Security of Host Sytems and Service Providers
  - Cloud services
    - Seem inherently less secure than on-premises, based on common-sense analysis.
    - In many cases, actually provide greater security than on-premises, according to evidence.
    - Add another layer of complexity to IT systems.
- - A gazdagép rendszerek és a szolgáltatók biztonsága
 - Felhőszolgáltatások
   - A józan ész elemzése alapján eredendően kevésbé biztonságosnak tűnik, mint a helyszíni.
   - A bizonyítékok szerint sok esetben valóban nagyobb biztonságot nyújt, mint a helyszíni.
   - Adjon hozzá egy újabb komplexitási réteget az IT-rendszerekhez.

### 2.20. A hibák biztonságos kezelése

- Error messaging
  - Default error messaging
  - Approach to Error Handling
  - Even when error messages do not give details, subtle clues may be provided to an attacker.
- A hibaüzenetekben nem szabad egyértelmű információkat kiadni, például bejelentkezésnél nem írjuk ki, hogy a jelszó hibás -> információ, hogy a felhasználónév jó
  - Fejlesztés során viszont fontos az egyértelmű hibamegjelölés -> utána ki kell kapcsolni
- Fail-Safe
  - A fail-safe system ensures that after a failure, the system is in the least harmful (or most secure) state for the data, the user, and anything else affected by the system.
  - A bad example:
  
```
if (IsAccessAllowed( ) == -1) {
  //Inform user that acces is denied here.
} else {
  //Allow user to do something here.
}
```

  - Ha a hozzáférés nem engedélyezett, tájékoztassa a felhasználót róla, ha engedélyezett csak engedélyezze
  - Improved example:

```
if (IsAccessAllowed( ) == 1) {
  //Allow user to do something here.
} else {
  //Inform user that access is denied here.
}
```

- Failure Recovery
  - Calls to the operating system, libraries, services, and APIs may return a value that indicates whether the call succeeded of failed.
  - Check return values that identify whether the call succeeded or failed, and respond appropriately.
  - When you write code to recover from failure:
- Implement Secure Error Handling
  - Exception handlers:
    - Place code that might throw an exception in a try block and code that handles exceptions in a catch block. (The mechanism for doing this varies from one language to other.)
    - Use the most specific exception for the code you're writing.
    - Avoid catching a fundamental exception type and handling all exception types in a generic way.
    - If you're using a language that supports a finally code block that in always called (whether an exception is thrown or not), then use it to return resources to the state they were in before the try block was executed.
    - Examples: Release connections to database/services, delete temporary files, release temporary data structures
    - Legyen nagyon konkrét a hibaleírás
-  Functions:
   -  Check return codes and respond appropriately when making calls to the operating system, libraries, services, and APIs.
   -  Avoid using functions that fail silently, and find safer alternative functions.
   -  If pass/fail return code not provided, check the return value to determine how to proceed:
      -  Safe to perform further calculations.
      -  Some other remediation is necessary.
- Respond to failures.
  - Due to an expected reason
    - Provide code to recover appropriately.
  - Due to an unexpected reason or a reason the program can't recover from
    - Log the unexpected value.
    - Cleanly terminate (break sessions, delete temporary files, destroy other resources an attacker might use.)
    - Ha kapcsolatot nyitok, naplózom a nyitását, zárását
    - Folyamatos naplózásra van szükség
    - A webalkalmazás számára elérhető naplófájlok készítése nagyon rossz!!! -> El kell kerülni, a naplófájlokat is védeni kell. 
    - Naplófájlok, időbélyegek használata

### 2.21. Emberi vonatkozású biztonság

- Az ember a gyenge láncszem, ha szoftverről és technológiáról van szó.
- Vulnerabilities Attributed to the Human Element
  - Using passwords that are easily broken by an attacker.
  - Providing credentials or access to an attacker:
    - Posting them in unsecure locations.
    - Leaving logged-in devices unattended.
    - Providing them directly to an attacker.
  - Storing files in unsecure locations.
  - Attaching unsecure devices to otherwise secure networks.
  - Leaving sensitive information on unsecure devices.
  - Transferring electronically secured information to unsecure outputs, such as printed hard copy.
  - Passing highly sensitive information in unsecure email.
  - Including sensitive information in a "Reply All" response
  - Accidentally addressing the wrong recipient in a confidential email.
  - Disabling or circumventing software security features.
  - Enabling unsecure software features, such as file-sharing, remote access, and so forth.
  - Skipping critical security checks to save time.
  - Downloading and (unintentionally) installing malware.
  - Visiting risky websites and blindly permitting malware to gain a foothold.
  - Falling for scams in email, text messaging services, and social networking sites.
  - Allowing unauthorized people into secure locations.
  - Changing security-related settings that they don't understand.
  - Mistakes by software developers and system administrators:
    - Accidentally changing the configuration of a firewall or server to a less ...
    - Forgetting to enable or re-enable important security monitoring or log...
    - Bypassing or disabling critical security checks.
- Social Engineering Attacks
  - Tailgating and piggybacking
  - Phishing
  - Spear phising
  - Baiting
  - Click-baiting
  - Social media reconnaissance
  - Nem szabad linkekre kattintani -> fel kell menni a szolgáltató saját oldalára, ott minden meglesz, nem kell a link
- Input validation
  - Critical security component of many applications, sice it protects angainst some of the most dangerous vulnerabilities.
  - Consider developing a centralized input validation function to reduce complexity, increase consistently, and makes it easier to improve and maintain.
  - Do not rely solely on client-side input validation since client-side code is generally easer to bypass or modify than server side.
  - All input to server operations should be validated on the server side.
  - Use client-side validation as well - to improve performance, for example.
  - Input validation can check for a number of factors, such as:
    - The type of data allowed (e.g., decimal numbers, currency)
    - The range of data allowed
    - Which characters are allowed
    - The minimum and maximum length of data

### 2.22. Biztonsági követelmények és tervezés

- The CIA Triad: Through development, ensure that your software provides three aspects of security:
  - Confidentiality - Keep information and communications private and protect them from unauthorized access.
  - Integrity - Keep an organization's information accurate, without error, and without unauthorized modification.
  - Availability - Ensure that systems operate continuously and that authorized users and access the data that they need.
- Evaluating Security Requirements
  - **S**ymbiotic: 
    - Don't conflict ot contradict each other
    - Work together as a system
  - **E**vident:
    - Each requirement is plain and clear
    - Can only be interpreted one way
  - **C**omplete:
    - Taken as a whole, the requirements communicate all security expectations for the project
  - **U**nitary:
    - Each requirement addresses one and only one thing
  - **R**ealistic:
    - Appropriate
    - Possible
    - Attainable
  - **E**valuable:
    - Expressed as something that can be measured 
    - Can be evaluated as passing or failing

### 2.23. Biztonság a szoftver életciklusán keresztül

- Igények összegyűjtése
  - Felhasználói igények
  - Platformkövetelmények
  - Biztonsági követelmények
  
![2.22](img/2.22.png)

  - Csillag: a sebezhetőség helye
- Kódellenőrzés
- Statikus és dinamikus kódellenőrzés
- GitHooks
- OWASP Top 10
- SonarQube
- Fuzzteszt, session management, pentest
- Telepítési fázis, felhasználókhoz kerül
- Ezt követően is előfordulnak hibák -> pl. függőségben komoly sebezhetőséget találnak -> javítani kell

### 2.24. Assignment: Exploring Leftover Artifacts

### 2.25. Exploring Leftover Artifacts

- Tisztázni kell, miket láthat a felhasználó, ennek megfelelően kell elhelyezni azokat

## 3. Designing for security

### 3.26. Principles of Secure Design

- OWASP Security Design Principles
  - Minimize attack surface area. -> Nem teszek be felesleges funkciót, amire nincs szükség -> plusz támadási felület
  - Establish secure defaults. -> alapértelmezett biztonsági beállítások -> MongoDB nyílt kiadása teljesen nyitott, ha nem változtatunk rajta. -> Beállíthatunk felhasználói fiókokat és 27017 porton van. -> Ha nincs beállítva fiók, a 27017 porton "belehallgatva" elérhetők az adatok, ha nincsenek felhasználók beállítva
  - Least privilege -> legkisebb kiváltság, szerep alapú hozzáférés-szabályozás kell
  - Defense in depth
  - Fail securely. -> hozzáférés megtagadása meghibásodás esetén!
- Input sanitize:
  - Bemenő adatok fertőtlenítése, 
    - Több helyen, nehezen karbantartható kód
    - Ha a kérés beérkezik, ha van benne a megadott karakterek közül -> fertőtlenítsd (middleware-ben célszerű)
- A biztonságnak is fontos szempontnak kell lenni a tervezés közben

### 3.27. Avoid Common Mistakes

- Avoiding The Top 10 Software Security Design Flaws
  - Earn or give, but never assume, trust. -> valamilyen módon meg kell teremteni a bizalmat két szolgáltatás között
  - Use an authentication mechanism that cannot be bypassed or tampered with. -> ha hitelesítési módszert használunk, meg kell bizonyosodni róla, hogy jó Pl. Oauth -> Oauth2
  - Authorize after you authenticate.
  - Strictly separate data and control instructions, and never process control instructions received from untrusted sources.
  - Define an approach that ensures that all data are explicitly validated.
  - Use cryptography correctly.
  - Identify sensitive data and how they should be handled.
  - Always consider the users. -> ne bízz a felhasználókban
  - Understand how integrating external components changes your attack surface. -> API-k használata veszélyes lehet
  - Be flexible when considering future changes to objects and actors.

### 3.28-3.29. Gyakori biztonsági tervezési hibák feladat és megoldás

### 3.30. Understand Risks and Vulnerabilities

- The Risk Equation
  - Threats: Something or someone that can take advantage of vulnerabilities - such as an attacker, malware, inexperienced user, accident, or disaster
  - Vulnerabilities: Deficiencies that enable an attacker to violate the system's integrity
  - Consequences: Damage resulting from a threat taking advantage of the vulnerability
  - Risk = Threats x vulnerabilities x Consequences
- Threat modeling - Fenyegetésmodellezés
  - Define general security objectives and scope - Általános biztonsági célok, hatókör meghatározása (scope)
    - Collect existing project documentation and guidelines.
    - Gather security requirements already defined for you, such as compliance and project requirements
  - Decompose the software
    - Break up your software into conceptual entry points, components, and boundaries where an attacker might interact with your application.
      - interfész alkalmazása az alkalmazás és adatbázis között
    - Identify assets an attacker might be interested in, who should be allowed to access each area, and how access is controlled
    - Diagram how data flows through the application
  - Identify and rank threats
    - Think like an attacker
    - Examine the application and identify where threats exist.
    - Use tools like STRIDE and DREAD to help you identify and rank threats
- Benefits of Threat Modeling
  - Can save time and problems in the development process
  - Enables you to identify design flaws during design, before you start writing code.
  - Reduces the time and cost needed to fix security issues later on.
  - May save time in testing since it will show where security test are needed.
  - Much more specific than a general project risk analysis.
  - Provides a high level of detail and insight into potential vulnerabilities in first draft of architecture.
  - Enables design improvements before any code is written, eliminating the time and expense of rework later
  - Should be performed even by solo developers or small teams who don't generally perform a formal risk analysis process.

![3.30](img/3.30.png)

### 3.31. Risk response strategies

- Risk response strategies

| Testing Method | Description |
| --- | --- | 
| Risk avoidance | Eliminate the risk (reduce it zero). You might accomplish this by averting the process, activity, or application that causes the risk. For example, a particular optional software feature brings unacceptable risk into play, you might simply decide to not include that feature to eliminate the risk it brings. |
| Risk transference | Move the responsibility for the risk partially or completely to another organization, such as an insurance company or an outsourcing provider. For example, you might outsource a particular web service from a vendor who will pay penalties if the service fails. Risk transference might be appropriate if the risks are larger and more complicated than your enterprise can manage on its own. |
| Risk mitigation | Implement controls and sountermeasures to reduce the likelihood and impact of risk to the organization. For example, you might write code that prevents users from entering certain data values that might present a security problem.|
| Risk acceptance | Agree that the risk is acceptable without taking any additional action. Perhaps the consequences are negligible or easily recovered from. Not all risks can be avoided; likevise, not al risks can be transferred or mitigated. As you develop software, you must decide what level of risk is unlikely or does not have enough potential for harm to warrant extra effort and cost. |

- Octa, Off zero használata

![3.31](img/3.31.png)

### 3.32. Exploit Countermeasures

- Countermeasures

![3.32](img/3.32.png)

![3.32.1](img/3.32.1.png)

## 4. Developing Secure Code

### 4.33. Guidelines for Secure Code

"A sebezhetőségeket általában mi okozzuk"

- Common General Programming Errors
  - A few types of common errors are responsible for many types of vulnerabilities
    - Development tools:
      - Provide warnings and hints about common errors.
      - Can help you write better code.
      - Pay attention to what they tell you

=>
- Inapptopriate use of dangerous functions, APIs, and system calls
- Use of deprecated libraries
- Buffer Overruns
- Race conditions
- Integer range issues
- Out of bounds array indexing
- Unhandlend exceptions
- Memory Leaks
- Dangling and null pointer references
- Unused code
- Unintitialized variables
- Injection vulnerabilities

---

- Javascriptben használjunk strict módot: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Strict_mode
  - Megelőzi az injection támadásokhoz vezető hibákat
- Vannak alapesetben szigorú nyelvek: Rust, Haskell
- Másokhoz kellenek olyan eszközök (pl. Javascript), amelyek kikényszerítik a szigorúságot
  - TypeScript -> lefordítja a scriptet Javascriptre

---

- Common General Programming Errors
  - Carefully research the configuration options available in your development tool kit.
    - Some options are not well known.
    - Their purpose may not be immediately clear.
    - They may not be enabled by default, but they can very helpful
    - So invest time to understand all of your tools' configuration options.

---

- Visual Studio compiler's /GS an # pragma strict_gs_check options can be set to perform automatic security checks for certain buffer overrun scenarios.

---

- Guidelines for Secure Coding - 1
  - Reduce unnecessary complexity.
  - Write code to be read by humans (meaningful variable names, clear coding style, etc.)
  - Use unit tests and comments to show and explain how code is intended to be used.
  - For common tasks, use well-maintained and tested existing code, rather than creating new code.
  - Review al third-party applications, code, libraries, and APIs to determine whether they are required, and whether they function safely.
  - In your declaration or before first use, explicitly initialize all variables and other data stores.
  - Never pass user-supplied inputs directly to any dynamic execution function.
  - Make sure your compiler warnings are enabled to point out potential security problems and coding problems before you find them in testing.
  - Do not enable your code to directly issue operating system commands, such as through command shells. Instead use task-specific APIs built in to the programming language, standard libraries, or related tools.
  - Prevent users from modifying code, generating, or injecting new code.
- Guidelines for Secure Coding - 2
  - Prevent race conditions by preventing multiple simultaneous requests (locking) or through a synchronization mechanism.
  - Protect shared variables and resources from inappropriate concurrent access.
  - When the application requires elevated privileges, raise privileges as late as possible, and drop them as soon as possible.
  - Eliminate the possibility of calculation and overflow errors. Look for:
    - Conversion and casting between data types
    - Values that are too large or too small to fit within the allocated range
    - Tuncation
    - Discrepancies in byte size, precision, signed/unsigned
    - NaN (not a number) calculations
  - Use code-signing, such as checksums or hashes, to verify the integrity of code including libraries, executables, interpreted code, resources, and configuration files.
  - Make sure updates are performed safely. Use cryptographic signatures for your cde and verify them in your download client. Use encrypted channels to transfer code to client.
  - Secure both client and server software, but emphasize server security.
  - Research and use the configuration options and user interface features of your development tool kit, which may alert you to possible security problems.

### 4.34. Buffer Overflows and Prevention

- Eszközök megfelelő megválasztása meghatározza (C++,C hajlamos erre)
- Magasabb szinten: Java, C# -> köztes nyelv, virtuális gépen fut, nem teljesen lehetetlen de nem mi kezeljük a memóriát
- Dinamikus nyelvek: Ruby, Python -> sokszor alacsony szintű nyelveken valósulnak meg mint C vagy C++ -> buffer overflow továbbra is lehetséges, de nem mi kezeljük manuálisan a memóriát
- Buffer Overrun Defects
  - Cause of many cyber security problems
    - Morris worm
      - The first major cyber attack on the Internet
      - Disabled large portions of the Internet for several days in 1988
    - The Heartbleed Bug
      - Put more than half of all web servers at risk in 2014
      - Put encrypted data and credential at risk of exposure
  - Enable an attacker to acces a data buffer
    - Reading or writing data that exceeds the boundaries allocated to that buffer
    - Can be used to:
      - Crash the software
      - Read (possibly sensitive) data outside the bounds of the buffer
      - Write data outside of the buffer, enabling attacker to inject malicious code or data
  - Apply to a wide variety of data types, such as pointers, arrays, and so forth
  - Types of buffer overruns include:
    - Buffer overflows
    - Buffer overreads
    - Interger overflows
    - Uncontrolled format strings

![4.34](img/4.34.png)

- Prevent Buffer Overflow Defects
  - Validate user input for type and length to ensure it will not overflow the legitimate data boundaries.
  - Use the least privileges possible for the accounts in which your processes run.
  - Be especially careful when passing input parameters to other code, especially unmanaged code, DLLs, etc.
  - (If you use third-party libraries), use only libraries that you have researched very carefully to ensure they are free from buffer overflow vulnerabilities.

![4.34.1](img/4.34.1.png)

- Make sure that the start location for each read operation remains within the buffer boundaries.
- Make sure that the end location for each read operation reamains within the buffer boundaries.

### 4.35. Race Conditions

- Multiprocessoring, multithreading

![4.35](img/4.35.png)

- Deadlocks
- Nem könnyen kihasználható sebezhetőség, de lehetséges
- Impact of Race Conditions on Threading/Muliprocessing
  - When you write multi-processing or multi-threading code always consider that:
    - Timing may not be completely consistent.
    - If errors occur, a process or thread may not even complete successfully.
    - You nedd to account for what happens when these problems occur.
  - Race conditions:
    - Often involve just a fraction of a second.
    - May also occur over a longer period of time.
- Prevent Race Conditions
  - Lock the shard resource when the process is modifying it, and unlock it when the process is done.
    - This can get qiute complicated.
    - Example: An error occurs in the process that has locked the resource, so you will deadlock other processes that use that resource. In some cases, it may be preferable to leave the resource locked than to continue in an undefinded state.
  - Write code that doesn't depend on side effects.
    - A side effect is when a function changes a variable outside of its own scope.
    - If possible, only modify data inside of the local scope of the thread or process.
  - Write temporary files in a data store that is available only to a single thread or process.
  - Research best practices for writing multiple threading or multiple processing code in the language and system you are developing in. Tools you might use (if available) include semaphores, mutexes, and others.

### 4.36-37. Assignment: Using Locks to Remediate a Race Condition - Activity: Using Locks to Remediate a Race Condition

### 4.38. OWASP TOP 10 Platform Vulnerabilities

- Webre vonatkozik, más platformokhoz is összeállítottak néhányat

![4.38](img/4.38.png)

### 4.39. Web Application Vulnerabilities Deep Dive

- Provide Secure Authentication and Session Management: To avoid authentiction and session management defects, make sure your software:
  - Bases authentication and session management capabilities upon a single set of strong authentication and session management controls.
  - Requires strong passwords.
  - Requires users to change passwords periodically and not reuse old passwords.
  - Does not log passwords entered on failed login attempts.
  - Blocks repeated failed attempts.
  - Provides a single, careful mechanism through which passwords can be changed.
  - Does not store password.
- Protect from Injection Attacks
  - Design your software to prevent user input (data) from being interpreted as a command.
  - Be careful using APIs that may not prevent user input from being interpreted as a command.
  - If it is not practical to implement other protections, escape input data so it will be treated as data, sot commands.
  - Use input validation to accept only characters that are allowed.
  - When possible, use strong data typing on variables that hold user input.
  - Limit users' database access to minimize the damage that can be caused by SQL injection.
  - Encrypt sensitive data in the database.
  - Don't store sensitive data in the database.
- Prevent XSS
  - XSS is a possible when web application dynamically includes user input in the web page's content without first properly validating the data.
  - The defect might be in client-side or server-side code.
  - An attacker can use this defect to:
    - Run a script in the victim's browser.
    - Hijack user sessions.
    - Deface websites.
    - Redirect the user to a malicious site.
  - Code analysis tools are not able to find all potential XSS problems.
  - Manual code review and testing is often necessary. Make sure that code:
    - Doesn't pass untrusted data to JavaScript or other browser APIs that generate active content.
    - Escape data on output.
    - Sanitizes HTML Content
    - Sets a Content-Security Policy (CSP) in HTTP headers:

```
X-Content-Security-Policy: script-src 'self' http://code.jquery.com; style-src 'self'
```

- Provide Secure Access Control
  - Application does not properly enforce restrictions on what authenticated users do.
  - Enables attacker to access unauthorized functionally and data, such as:
    - Access other user accounts.
    - View sensitive files.
    - Modify other user data.
    - Change access rights.
  - To avoid this defect, make sure your software:
    - Provides a consistent, easy-to-analyze authorization module that is invoked from all of your business functions. Frequently, such protection is provided by one or more components external to the applicaton code.
    - Denies al access by default, explicitly granting access to specific roles for every function.
    - Ensures that conditions are in the poper state to allow access to functions that are part of a workflow.
    - Enables entitlements to be easily updated and audited (not hard-coded).
    - Protects each function and each type of data that requires access control.
    - Does not prvide "side door" navigation to functions and data that require access control.
    - Checks authentication and authorization on the server side.
    - Does not expose direct object referencing schemes (such as a path and file name), but instead uses a per-user or per-session indirect reference to identify objects.
      - Example: Use an index value to identify all files to which the current user has authorized access, rahter than a file path or database key that an attacker could use to figure out how to access other resources.
- Prevent Security Misconfiguration
  - Good security requires having a secure configuration defined and deployed for the application, frameworks, application server, web server, database server, platform, etc. pl. MongoDB regisztráció nélkül nyitva áll a világ előtt
  - Secure settings should be defined, implemented, and maintained, as default are often not secure.
  - Unnecessary features shoulc be removed or disabled.
  - Default logging and error messages should be reviewed to ensure they don't provide information helpful to an attacker.
  - Software should be kept up to date.
- Prevent Sensitive Data Exposure
  - Many web application and APIs do not properly protect sensitive data, such as financial, healthcare, and PII.
  - Attackers may steal of modify such weakly protected data to conduct credit card fraud, identity theft, or other crimes.
  - Sensitive data requires extra protection (encryption at rest or in transit) and special precautions when exchanged with the browser.

### 4.40. Mobile Application Vulnerabilites

- Use Platforms Properly
  - Misuse of a platform feature of failure to use platform security controls can lead to vulnerabilities.
  - Examples: Providing escessive platform permissions and misusing security controls such as iOS Keychain, the Android Keystore System, Windows Hello, encryption APIs, and so forth.
- Store Data Securely
  - Storing data improperly may expose it or cause unintended data leadage.
  - This covers a wide range of possible problem areas, such as file and object storage on loccal drives, SD cards, network volumes, and cloud storage, as well as memory caches, databases, log files, web cookies, and browser local storage.
  - Vulnerabilities may originate from a variety of sources, such as the operating system, frameworks, the compiler environment.
- Provide Secure Communication
  - This includes:
    - All aspects of packaging sensitive data and tramsmitting it into or out of the device.
    - Using services improperly, exposing data, and transmitting sensitive assets without encryption
    - Communication between applications, between devices, between an application and server.
    - Technologies such as TCP/IP, Wi-Fi, Bluetooth, NFC, audio, infrared, GSM, 3G, SMS, and RFID.
    - Transport layer security problems, such as poor handshaking, using vulnerable SSL versions, failing to check certificates.
    - Data such as passwords, tokens, encryption keys, private user information, account details, documents, metadata, and code.
    - Risk to data in transit, such as unauthorized viewing or modification, and the inability to prove the data-s origin.
    - Never store the user's password or shared secrets on the client.
    - Enforce strong password policies.
    - Make sure authentication requirements of your various platforms match. For example, authentication requirements of your mobile and desktop applications should match those of the equivalent web application.
    - Whenever possible, perform authentication requests on the server side. Load application data on the client only upon successful authentication.
    - Avoid storing sensitive data on the client. I you must do this, ensure that data will only be accessible upon successfully entering the correct credentials by using an encryption key that is securely derived from the user's login credentials.
    - Persistent authentication ("remember me on this device") is not a safe default fr mobile applications. Provide it as an opt-in setting.
    - For mobile device applications, enable the user to revoke persistent authentication from a remote management console so the user can reverse access by stolen or lost devices.
- Provide Sufficient Cryptography
  - Incorrect or inappropriate use of cryptography can leave sensitive data exposed.
- Provide Secure Authorization
  - Failure to authorize properly may enable an attacker to gain elevated privileges.
  - An example of insecure authorization includes having client-side code that determines permissions based on authentication, where it facilities a client-side attack.
- Ensure Client Code Quality
  - A variety of client code quality problems on the client side (desktop and mobile apps, web clients, etc.) may lead to a wide range of security problems.
  - Examples of client code quality problems include buffer overflows and format string vulnerabilities.
- Prevent Code Tampering and Reverse Engineering
  - Exposure of code and data may enable an attacker to:
    - Identify vulnerabilities, information about back-end servers, cryptographic constants and ciphers, and intellectual property.
    - Directly modify an application's functionality.
    - Change the contents of memory.
    - Change or replace system APIs
    - Modify data and resources in order to subvert the intended use of the software.
  - Mobile apps are especially vulnerable to reverse engineering and code tampering.
  - To reverse engineer, the attacker processes exposed files (such as an app package ona mobile device) to extract its souce code, libraries, algorithms, and other assets.
- Eliminate Extraneous Functionality
  - Developers might include extra or hidden functionality in the released version of an app, which provides a back door that gives an attacker inappropriate access.
  - Examples include noting a password within an included app resource, or disabling two-factor authentication during testing and leaving it disabled in the release version.

### 4.41. IoT Vulnerabilities Deep Dive

### 4.42. Desktop Vulnerabilities Deep Dive

### 4.43. Privacy Vulnerability Defects

- Privacy Vulnerability Defects
  - Protect users' sensitive data from being exposed by:
    - Independent hackers
    - Government agencies (foreign and domestic, intelligence service, police agencies)
    - Violent non-state actors (such as terrorist organizations and drug cartels)
    - Users themselves - from inadvertently leaving sensitive information unprotected
  - OWASP's list of the Top 10 Privacy Risks
    - P1: Web Application Vulnerabilities
    - P2: Operator-sided Data Leakage
    - P3: Insufficient Data Breach Response
    - P4: Insufficient Deletion of Personal Data
    - P5: Non-transparent Policies, Terms and Conditions
    - P6: Collection of data not required for the primary purpose
    - P7: Sharing of data with third party
    - P8: Outdated personal data
    - P9: Missing or Insufficient Session Expiration
    - P10: Insecure Data Transfer
- Privacy by Design
  - Account for privacy throughout every development phase, as in Security by Design.
  - Not simply protecting data, but designing software so data doesn't need protection.
    - E.g., avoid transferring data from the client to the server in the first place.
  - Initially proposed by Ann Cavoukian, the Information & Privacy Commissioner of Ontario, Canada, as a set of severn principles:
    - Proactive not Reactive; Preventative not Remedial
    - Privacy as the Defaul Setting
    - Privacy Embedded into Design
    - Full Functionality - Postive-Sum, Not Zero-Sum
    - End-to-End Security - Full Lifecycle Protection
    - Visibility and Transparency - Keep it Open
    - Respect for User Privacy - Keep it User-Centric
- Data Anonymization
  - To maintain privacy, personal identifiable information (PII) may nedd to be anonymized before it can be processed and analyzed.
  - This means that the identity associated with personal data has been masked somehow so the data can be processed and analyzed without revealing the person associated with that data.
- Protect Sensitive Information
  - Identify any information that is sensitive, and apply appropriate controls to ensure it remains private
    - Consider all personally identifiable information (PII) sensitive, as it can be used to establish a person's identify and might be used to cause them substantial harm, embarrassment, inconvenience, or unfairness.
    - Refer to privacy guidelines for yout country, municipality, or organization for specific lists of PII you may be legally required to protect.
    - A typically list includes:
      - User name
      - Email address
      - Home address
      - Phone number
      - Social Security number (even if it's jut the last 4 digits)
      - Driver's license or state ID#
      - Passport number
      - Allen registration number
      - Finincial account number
      - Biometric identifiers
      - Citizenship or immigration status
      - Medical information
      - Ethnic of religious association
      - Sexual orientation
      - Account passwords
      - Date of birth
      - Criminal history
      - Mother's maiden name
- Anonymize Personal Data
  - Use one of the following techniques to mask the identifying data:
    - Replacement - Substitute any values that could be used to identify the user with different values.
    - Suppression - Omit (all or in part) any values that could be used to idenfity the user.
    - Generalization - Substitute specific values that could be used to identify the user with something less specific. For example, geeral the date of birth to the year or decade in which the user was born.
    - Perturbation - Make random changes to the data to corrupt values that could be used to identify the user.
  - Anonimize non-sensitive data as well, if it could be used for the reverse anonymization of sensitive data.
  - Make sure that the masking process will produce the same results each time.
  - Make sure that the same masking process will produce the same results each time.
  - Make sure that data types remain compliant with the schema.
  - Preserve the meaning of the data.
- Prevent Operator-Sided Data Leakage
  - The system operator may exposed data.
    - Intentional malicious breach.
    - Unintentional mistake.
  - Defects in the software may enable such leakage, such as:
    - Weak or poorly implemented access management controls
    - Encryption
  - To avoid this defect:
    - Implement effective and secure access management controls.
    - Endrypt data at rest and in transit.
    - Implement effective, secure appropriate identity and access management.
    - Provide awareness training for all employees on handling personal data.
    - Implement a data classification and information handling policy.
    - Implement tools like data leakage prevention and SIEMs to monitor and detect data leaked from endpoints, web portals, and cloud services.
    - Implement privacy by design.
    - Anonymize personal data.
- Respond Appropriately to Data Breaches
  - A data breach should be followed up with an appropriate response.
    - Example: Limit the extent of the leak, inform those who are affected, and remedy defects or problems that made the breach possible.
  - To avoid this defect:
    - Provide continuous monitoring and logging features to monitor for situations that might indicate personal data leakage and loss.
    - Provide features to warn users of possible suspicious activity in theri accounts.
    - Create, maintain, and periodically test an incident response plan.
    - Continuously monitor for personal data leakage and loss.
    - When a breach occurs:
      - Validate that the breach occured.
      - Determine the most effective way to prevent further leakage, and implement it.
      - Assign in indcident manager to be responsible for the investigation.
      - Decide how to investigate and respond to the data breach to ensure that evidence is appropriately handled.
      - Assemble an incident response team.
      - Notify affected people as appropriate.
      - Determine whether to notify the authorities as appropriate.
      - Remedy any defects of problems that made the breach possible
  - Delete Private of Sensitive Data That is No Longer Needed
    - Defects make the software fail to delete private or sensitive data that is no longer needed, putting privacy at risk.
    - To avoid this defect:
      - Design the software to minimize data that is stored in the first place.
      - Promptly delete data that is no longer needed.
      - Properly delete data when a user issues a rightful request.
      - Securely lock the data from any access until deletion is possible, if prompt deletion is not possible due to technical restrictions.
      - Ensure prompt deletion of data in backups, copies, cloud storage, or data shaed with third-party sources.
      - Clearly inform users when backups must be kept, as requird by law.
      - Provide evidence (such as logging and messagint to the user) to verify deletion according to policy.
      - Identify deletion policies (circumstances under which data must be deleted, and the timeframe dor deletion), and implement automation and/or manual procedures to ensure that happens.
  - Make Sure Privacy Policies, Terms and Conditions are Clear
    - The software may not make it clear to users what it will do with their data so users can make good decisions about how to manage their data within the software.
    - To avoid this defect:
      - Provide release notes with software updates to clearly and simply explain how terms and conditions change over time.
      - Track which users have consented to the terms and conditions, including the version if terms and conditions have changeed over time.
      - Implement a Do Not Track feature on the server side, so users can disable tracking, and provide an opt-out capability for users.
      - Provide users with a list of all tracking mechanisms used in the software, explaining how and by whom the information is used.
      - Inform users (through a clear and well-written terms and conditions page, for example) how datais processed, including collection, storage, processing, and deletion.
    - Consider using a readability tester (such as https://readable.io) to help you verify that your terms and conditions are easy to read.

### 5.44. Secure Session Management



---

1. [ ] [Cyber Secure Coder](https://subscription.packtpub.com/video/cloud-and-networking/9781835884348/p2/video2_1/bugs-in-software)