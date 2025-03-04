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
  - olyan típusú kibertámadás, amely a webes alkalmazások vagy adatbázisok sebezhetőségeit használja ki.
  - a támadás során rosszindulatú inputot illesztenek be a felhasználói bemenetekbe vagy lekérdezésekbe, és ez lehetővé teszi a támadók számára, hogy manipulálják és futtassák a nem kívánt strukturált lekérdezési nyelvet vagy SQL parancsokat az alkalmazás adatbázisában
- XML injection:
  - XPath injectionnek is nevezik
  - Olyan biztonsági sebezhetőség, amely az XML-adatokat vagy bővíthető jelölőnyelvi adatokat feldolgozó webes alkalmazásokat célozza
  - A támadás során a támadó manipulálhatja az XML-bemeneteket, hogy kihasználja az alkalmazás XML-elemző vagy feldolgozó mechanizmusainak sebezhetőségeit. Ez aztán jogosulatlan hozzáféréshez, adatfeltáráshoz vagy más rosszindulatú műveletekhez vezethet az adott webes alkalmazáson belül.

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