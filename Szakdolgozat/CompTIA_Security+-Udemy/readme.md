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
  - Információhoz csak a megfelelő jogosultsággal rendelkező férjen hozzá.
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
- Threat (fenyegetés): Minden