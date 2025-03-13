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

### 1.8 Támadási minták

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


---

1. [ ] [Cyber Secure Coder](https://subscription.packtpub.com/video/cloud-and-networking/9781835884348/p2/video2_1/bugs-in-software)