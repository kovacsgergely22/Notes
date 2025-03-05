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

- Confidentiality (bizalmasság, titoktartás)
  - Az érzékeny és magánjellegű információhoz csak a megfelelő jogosultsággal rendelkező férjen hozzá, illetéktelen személy, szervezet vagy eljárás számára ne.
  - bankos példa, látható érzékeny adatokat tartalmazó iratok
  - Az adatokat titokban és biztonságban kell tartani a kíváncsi szemek elől, de rendelkezésre bocsátani az arra jogosultak számára
  - Fontos:
    - A személyes adatok védelme miatt
    - Üzleti előnyök fenntartása miatt
    - Jogszabályi megfelelés miatt
- Integrity (integritás)
  - Adatok pontosak és változatlanok maradjanak, hacsak nem szükséges a módosítás
  - ellenőrző összegek
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