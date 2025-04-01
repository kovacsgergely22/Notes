# Számítógép hálózatok üzemeltetése

## Órai jegyzetek

### 1. óra

- Packet Tracer szemléltetésre jó
- GNU szimulátor hálózatok tervezéséhez
- a hub = repeater

## Neworking Academy jegyzetek

### 1.0 Bevezetés

### 1.1 A hálózatok hatása az életünkre

### 1.2 A hálózat részei

#### 1.2.1 Állomások

- Minden olyan számítógépet állomásnak nevezünk, amely csatlakozik a hálózathoz és közvetlenül részt vesz a hálózati kommunikációban
- Az állomásokat végberendezéseknek vagy hosztnak (host) is nevezzük.
- Bizonyos állomásokat **kliensnek (client, ügyfél)** is nevezünk
- Az állomás kifejezés azonban kifejezetten azokra a hálózaton lévő eszközökre vonatkozik, amelyek kommunikációs célokra számot kapnak -> IP (Internet Protocol) cím
- A **szerverek (kiszolgálók)** olyan számítógépek, amelyeken olyan szoftverek futnak, amelyek információt (pl.: e-mail szolgáltatást vagy weboldalakat) biztosítanak más végberendezések számára.

#### 1.2.2 Egyenrangú hálózatok

- A kliens és a szerver programok általában külön számítógépeken futnak, de az is lehetséges hogy egy számítógép a két szerepet egyszerre töltse be. Kisvállalati és otthoni hálózatokban egy állomás gyakran egyszerre szerverként és kliensként is szolgál. Az ilyen hálózatot egyenrangú (peer-to-peer) hálózatnak nevezzük.
- Az egyenrangú hálózatok előnyei:
  - Könnyen konfigurálható
  - Kevésbé összetett
  - Alacsonyabb költségű, mivel hálózati eszközökre és dedikált kiszolgálókra nincs szükség
  - Egyszerű feladatok (pl.: fájlátvitel és nyomtatómegosztás) elvégzésére alkalmas
- Az egyenrangú hálózatok hátrányai:
  - Nincs központosított adminisztráció
  - Nem biztonságos
  - Nem skálázható
  - Minden eszköz működhet egyszerre kliensként és kiszolgálóként is, ami csökkentheti a teljesítményüket

#### 1.2.3 Végberendezések

#### 1.2.4 Közvetítő eszközök

- Eszközök (Intermediary Devices):
  - Wireless router
  - Multiplayer switch
  - LAN switch
  - Firewall Appliance
  - Router
  - (régen Ethernet Hub -> többportos ismétlő, újragenerálja és újraküldi a kommunikációs jelet => Mindegyik másik eszköz ezt is tudja)
- A közvetítő hálózati eszközök az alábbi feladatok egy részét vagy akár mindegyikét látják el:
  - A kommunikációs jelek újragenerálása és továbbítása
  - A hálózaton belüli és a hálózatok közti különböző útvonalak információinak karbantartása
  - Más eszközök értesítése hibákról és a kommunikáció sikertelenségéről
  - Kapcsolati hiba esetén alternatív útvonalak biztosítása
  - Üzenetek osztályozása és továbbítása prioritásuk alapján
  - Az adat továbbításának engedélyezése vagy megtagadása a biztonsági beállítások alapján

#### 1.2.5 Hálózati átviteli közeg

- A modern hálózatok elsősorban az ábrán látható háromféle közeg egyikét használják
  - **Fémdrót kábelben (Copper)** - Az adat elektromos impulzusokká kódolva halad.
  - **Üveg- vagy műanyag szálak kábelben (üvegszálas vagy optikai kábel - Fiber-optic)** - Az adat fényvillanások formájában halad.
  - **Vezeték nélküli átvitel (Wireless)** - Az adatokat az elektromágneses hullámok bizonyos frekvenciáinak modulációjával kódolják.
- A hálózati közeg kiválasztásakor figyelembe kell venni:
  - Az adott közeg milyen távolságra képes elvinni a jelet?
  - Milyen környezetbe lesz telepítve a közeg?
  - Mennyi adatot és milyen sebességgel kellene továbbítani?
  - Mennyibe kerül a közeg és a telepítése?

### 1.3 A hálózatok megjelenítése és a topológiák

#### 1.3.1 A hálózatok megjelenítése

- rajzjelek, ábra
- A rajzjeleken kívül az eszközöknek és közegeknek speciális szókincse is van:
  - **Network Interface Card (NIC)** - A hálózati kártya fizikailag csatlakoztatja a végberendezést a hálózathoz.
  - **Fizikai port** - Aljzat vagy csatlakozó egy hálózati eszközön, ide csatlakozik egy végberendezéshez vagy egy másik hálózati eszközhöz vezető kábel.
  - **Interfész** - Speciális port a hálózati eszközön, amely más hálózatokhoz csatlakozik. Mivel a routerek hálózatokat kötnek össze, ezért a router portjait hálózati interfészeknek nevezzük.

#### 1.3.2 Topológiai ábrák (network topology diagrams)

- Fizikai topológiai ábra: szemléltetik a közvetítő eszközök fizikai helyét és a kábeltelepítést, látjuk rajta azt, hogy melyik helyiségben vannak az eszközök.
- Logikai topológiai ábrák: illusztrálják a hálózat eszközeit, portjait és címzési sémáját. Láthatjuk, hogy melyik végberendezés melyik közvetítő eszközhöz csatlakozik, és milyen átviteli közeggel.

### 1.4 Gyakori hálózattípusok

#### 1.4.1 Különböző méretű hálózatok

- Az **egyszerű otthoni hálózatok** lehetővé teszik az erőforrások (pl.: nyomtatók, dokumentumok, képek és zenék) megosztását néhány helyi végberendezés között.
- A **kisvállalati és otthoni irodai (SOHO) hálózatok** lehetővé teszik az emberek számára, hogy otthonról vagy egy távoli irodából dolgozzanak. Sok egyéni vállalkozó használ otthoni vagy kisebb irodai hálózatot termékei eladására és reklámozására, eszközök megrendelésére vagy az ügyfelekkel való kapcsolattartásra.
- A **vállalatok és a nagy szervezetek hálózataikat** arra használják, hogy a hálózat szerverein tárolják és onnan érjék el a céges információkat. A hálózatok e-mailt, azonnali üzenetküldést és csoportmunka lehetőségeket is biztosítanak. Számos szervezet használja a saját hálózatát arra, hogy azon keresztül termékeket vagy szolgáltatásokat nyújtson ügyfeleiknek.
- Az **internet** a legnagyobb létező hálózat. Maga a kifejezés azt jelenti, hogy "a hálózatok hálózata". Egymással összekapcsolt magán- és nyilvános hálózatok alkotják.
- **Kisvállalatokban és otthonokban** sok számítógép működik szerverként és kliensként is a hálózaton. Az ilyen hálózatot **egyenrangú (peer-to-peer)** hálózatnak nevezzük.

#### 1.4.2 LAN-ok és WAN-ok

- A hálózatokat több szempont szerint osztályozhatjuk:
  - A lefedett terület mérete
  - A kapcsolódott felhasználók száma
  - Az elérhető szolgáltatások száma és típusa
  - Felelősség mértéke
- **Helyi hálózat (LAN)**
  - olyan hálózati infrastruktúra, amely kis földrajzi elhelyezkedésű területen biztosít összeköttetést felhasználók és végberendezések számára
  - lehet egy vállalat egy részlege, egy otthoni vagy egy kisvállalati hálózat
- nagy kiterjedésű hálózat (WAN)
  - olyan hálózati infrastruktúra, amely más hálózatokhoz biztosít hozzáférést nagyobb földrajzi területen, jellemzően egy nagyobb vállalat vagy távközlési szolgáltató a tulajdonosa és karbantartója