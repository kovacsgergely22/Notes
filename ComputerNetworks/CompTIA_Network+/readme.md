# Jegyzetek a CompTIA Network+ vizsga anyagából

## Section 6 - Wireless Networks

### 1. Vezeték Nélküli Hálózat Típusok
- A vezeték nélküli hálózatok forradalmasítják a kapcsolódási lehetőségeket, rugalmasságot és skálázhatóságot kínálva.
    - Ad Hoc Hálózat / Független Alap Szolgáltatási Készlet (Independent Basic Service Set - IBSS)
        - Az eszközök közvetlenül kapcsolódnak egymáshoz, nem központi hozzáférési ponton keresztül.
        - Peer-to-peer (egyenrangú fél) hálózatként működik.
        - Ideális gyors, ideiglenes beállításokhoz, meglévő infrastruktúra nélkül.
        - Lehetővé teszi a közvetlen fájlmegosztást az eszközök között a hatótávolságon belül.
    - Infrastruktúra Hálózatok
        - Szervezettebb beállítás, ahol az eszközök vezeték nélküli hozzáférési pontokon (AP-kon) keresztül csatlakoznak vezetékes helyi hálózatokhoz (LAN-okhoz).
        - Konfiguráció:
            - Basic Service Set Identifier (BSSID): Egyedi azonosító, alapértelmezés szerint a vezeték nélküli AP MAC-címére van beállítva.
            - Service Set Identifier (SSID): A hálózat közös alfanumerikus neve.
        - Nagyobb hálózatok: Több AP-t is igényelhetnek Extended Service Set (ESS) konfigurációval.
            - Az ESS egy nagyobb hálózatot hoz létre, amely ugyanazt az SSID-t (ESSID) használja a zökkenőmentes csatlakozás érdekében.
    - Pont-Pont Hálózatok
        - Két különálló helyszínt köt össze nagyobb távolságokon nagy nyereségű antennák használatával.
        - Statikus jellegű, rögzített helyszínekkel mindkét végén.
        - Dedikált sávszélességet kínál, ideális épületek vagy területek összekapcsolására, ahol a kábelezés nem kivitelezhető.
    - Mesh Hálózatok
        - Sokoldalú és ellenálló, a csomópontok többszörösen kapcsolódnak egymáshoz, végtelen adatátviteli útvonalakat hozva létre.
        - Öngyógyító képességgel rendelkezik, biztosítva a stabilitást a meghibásodott útvonalak újrakonfigurálásával.
        - Alkalmas nagyméretű telepítésekre, ahol a kábelezés nem praktikus vagy túl drága.
        - Két típusa van: ESS konfigurációt használ infrastruktúra módban, és többhálózati integrációt foglal magában.
    - Autonóm vs. Könnyűsúlyú Hozzáférési Pontok (AP-k)
        - Autonóm AP: Önálló eszközök, amelyek önállóan kezelik a vezeték nélküli funkciókat; kisebb beállításokhoz hasznosak, ahol nincs szükség központi vezérlőre.
        - Könnyűsúlyú AP: Központilag egy vezeték nélküli vezérlő irányítja őket; egyszerűbbek és olcsóbbak, megkönnyítve a kezelést nagy hálózatokban.
    - Vezeték Nélküli Hálózat Típus Kiválasztásának Szempontjai: A teljesítmény, a megbízhatóság és a könnyű használat a hálózattípustól függően változik; fel kell mérni a specifikus környezeti igényeket és feladatokat a megfelelő típus kiválasztásakor.

---

### **1. Vezeték Nélküli Hálózati Típusok Teszt**

1.  Melyik vezeték nélküli hálózati típusban csatlakoznak az eszközök **közvetlenül egymáshoz, központi hozzáférési pont nélkül**?
    A. Infrastruktúra mód
    B. Pont-pont hálózat
    C. Ad Hoc hálózat
    D. Mesh hálózat

2.  Melyik vezeték nélküli hálózati típus jellemzően egy **központosított vezeték nélküli hozzáférési pontot (AP) használ**, és fizikai hálózatban a csillag topológiához hasonlóan működik?
    A. Ad Hoc mód
    B. Infrastruktúra mód
    C. Mesh hálózat
    D. Pont-pont hálózat

3.  Melyik vezeték nélküli hálózati típus az, amelyik **sokoldalú és ellenálló**, a csomópontok több másik csomóponthoz is csatlakoznak, ezzel **végtelen számú útvonalat** hozva létre az adatok számára, és **önmagát gyógyító képességgel** is rendelkezik?
    A. Infrastruktúra hálózat
    B. Ad Hoc hálózat
    C. Pont-pont hálózat
    D. Mesh hálózat

4.  Melyik állítás írja le legpontosabban a **pont-pont vezeték nélküli hálózatot**?
    A. Ideális gyors, ideiglenes beállításokhoz, meglévő infrastruktúra nélkül.
    B. Két különálló helyet köt össze hosszabb távolságokon, **nagy nyereségű antennákat** használva.
    C. Jellemzően egy hozzáférési pontra támaszkodik, amely a hálózat központi pontjaként szolgál.
    D. Több csomópont közötti dinamikus útválasztási döntésekre támaszkodik a rugalmasság érdekében.

---

### 2. Vezeték Nélküli Antennák
- Az antennák határozzák meg a továbbított jel irányát és hatótávolságát.
- A vezeték nélküli antennák olyan eszközök, amelyek rádiófrekvenciás jeleket küldenek és fogadnak.
    - Típusok:
        - Omni-direkcionális Antennák
            - Úgy vannak kialakítva, hogy minden irányba egyenlő erővel sugározzanak és fogadjanak jeleket.
            - Ideálisak széles lefedettség biztosítására egyenletes jelerősséggel.
            - Gyakran használatosak vezeték nélküli hozzáférési pontokban, mobil hotspotokban és nyilvános hálózatokban.
            - Gyakran be vannak építve eszközökbe (vezeték nélküli AP-k, mobiltelefonok).
            - Akkor használatosak, ha a jel iránya ismeretlen, vagy több eszközhöz kell elérnie.
        - Uni-direkcionális Antennák
            - Az energiát egyetlen irányba koncentrálják a fókuszált jelnyaláb érdekében.
            - Legjobb, ha jeleket specifikus területekre vagy távoli helyszínekre irányítják.
            - Gyakran használják pont-pont kapcsolatokban, távoli épületek vagy területek összekapcsolására.
            - Hasznosak nagy távolságú kommunikációhoz vagy a jelszivárgás korlátozásához.
            - Változatok: balra vagy jobbra irányított.
        - Yagi Antennák
            - Egy speciális típusú irányított antenna, amely nagy jelnyereséget biztosít.
            - Keskeny sugárral működik nagy távolságú kommunikációhoz egy specifikus irányba.
            - Gyakran használják távoli területeken, cellatornyokhoz vagy televíziós adókhoz való csatlakozáshoz.
        - Parabolikus Antenna
            - Speciális irányított antenna ívelt tányérral.
            - Gyakran használják mikrohullámú jelekhez és műholdas TV-hez az energia egy adott pontra fókuszálásához.
    - Az Antenna Kiválasztásának Szempontjai: A választást a vezeték nélküli rendszer specifikus igényeihez kell igazítani; tényezők közé tartozik a kívánt lefedettségi terület, jeltartomány és fizikai környezet.
    - Megfelelő Antenna Kiválasztásának Előnyei: Biztosítja az erős és megbízható kapcsolatot, testre szabja a hálózatot a felhasználói igényekhez és a térbeli korlátokhoz, javítja a vezeték nélküli kommunikációs rendszer teljesítményét és hatékonyságát.
    - A nagyobb antennák növelhetik a jeltávolságot, de több energiát igényelnek.
    - Vizsga Tippek: Értse meg, mikor kell használni az egyes antennatípusokat, ismerje a patch antennákat épületek közötti kommunikációhoz, és ismerje fel az antennatípusokat a jellemzőik alapján (omnidirekcionális, unidirekcionális, parabolikus, Yagi).
### 3. Vezeték Nélküli Frekvenciák
- A vezeték nélküli frekvenciák a rádióhullámok vezeték nélküli hálózatokban történő továbbítására és fogadására használt különböző frekvenciasávokra utalnak.
- Minden frekvenciasávnak specifikus jellemzői vannak a sebességgel, lefedettséggel és az interferencia elkerülésére vonatkozó szabályozásokkal kapcsolatban.
    - 2.4 GHz Sáv
        - Széles körben használt 1997 óta.
        - Nagy hatótávolságú és jobban áthatol a szilárd tárgyakon.
        - Frekvenciák: 2.400 GHz-től 2.495 GHz-ig.
        - Csatornákra osztva, amelyek átfedik egymást, interferenciát okozva.
        - Nem átfedő csatornák az interferencia elkerülése érdekében: 1, 6, 11.
    - 5 GHz Sáv
        - Gyorsabb adatátviteli sebességet kínál, rövidebb hatótávolsággal a 2.4 GHz-hez képest.
        - Frekvenciák: 5.7 GHz-től 5.875 GHz-ig, akár 24 nem átfedő csatornát biztosítva.
        - Csatornakötés (Channel Bonding): Két vagy több szomszédos csatorna összevonásával szélesebb csatorna létrehozása; növeli a sávszélességet, de növeli az interferencia érzékenységét.
    - 6 GHz Sáv
        - A legújabb spektrum a vezeték nélküli hálózatokhoz.
        - Több csatornát és sávszélességet kínál, gyorsabb kapcsolatokat biztosítva kevesebb torlódással.
        - Frekvenciák: 5.925 GHz-től 7.125 GHz-ig.
        - Lehetővé teszi 20, 40, 80 vagy 160 MHz szélességű csatornákat, akár 59 csatornát is.
    - Kormányzati Szabályozások és Szabványok
        - A kormányzat a vezeték nélküli spektrum bizonyos részeit vezeték nélküli hálózatok számára osztja ki, a szabályozások globálisan eltérőek.
        - 802.11h Szabvány: Az európai szabályozásoknak való megfelelés érdekében fejlesztették ki.
            - Dinamikus Frekvencia Kiválasztás (DFS): Az eszközöknek aktívan figyelniük kell a környezetet radarjelekre.
            - Adatátviteli Teljesítmény Vezérlés (TPC): Az eszközök beállítják az átviteli teljesítményüket a szükséges minimumra a jó minőségű kapcsolat fenntartása érdekében.
        - Sávvezérlés (Band Steering): Optimalizálja az ügyféleszközök eloszlását a különböző frekvenciasávok között; releváns olyan környezetekben, ahol két vagy több frekvenciasávot használnak.
    - Frekvenciasávok Összehasonlító Elemzése
        - 2.4 GHz: Lassabb sebesség, de nagyobb lefedettség.
        - 5 GHz: Gyorsabb sebesség, rövidebb hatótávolság és megnövekedett interferencia érzékenység szélesebb csatornákkal.
        - 6 GHz: Leggyorsabb sebesség, de legrövidebb távolság és kisebb áthatolás szilárd tárgyakon.
### 4. 802.11 Szabványok
- Az IEEE 802.11 szabvány határozza meg a vezeték nélküli helyi hálózat (WLAN) kommunikációs technológiáit, amelyek az idővel fejlődtek a gyorsabb adatátviteli sebességek és a megbízhatóbb hálózatok iránti igények kielégítésére.
    - Wireless a (802.11a)
        - Frekvenciasáv: 5 GHz.
        - Sebesség: akár 54 Mbps.
        - Hatótávolság: körülbelül 35 méter.
        - Az 1990-es évek végén vezették be, főként üzleti felhasználók használták a költségek miatt.
    - Wireless b (802.11b)
        - Frekvenciasáv: 2.4 GHz.
        - Sebesség: kezdetben 11 Mbps.
        - Hatótávolság: körülbelül 140 méter.
        - Olcsóbb és hozzáférhetőbb volt, mint a Wireless a, ami széles körű elterjedéshez vezetett.
    - Wireless g (802.11g)
        - Frekvenciasáv: 2.4 GHz.
        - Sebesség: akár 54 Mbps.
        - Hatótávolság: körülbelül 140 méter.
        - Hasonló sebességet és hatótávolságot kínál, mint a Wireless a, de olcsóbb frekvenciasávot használ.
    - Wireless n (802.11n / Wi-Fi 4)
        - Frekvenciasáv:
            - 5 GHz: Sebesség akár 600 Mbps, hatótávolság kb. 35 méter.
            - 2.4 GHz: Sebesség akár 300 Mbps, hatótávolság kb. 70 méter.
        - A gyorsabb hálózati sebességek iránti igények kielégítésére vezették be.
        - Multiple-Input Multiple-Output (MIMO): Technológia, amely lehetővé teszi a hozzáférési pont számára, hogy több antennát használjon az adatátvitelre gyorsabb sebességgel, mintha egyetlen antennával tenné; hubként működik.
    - Wireless ac (802.11ac / Wi-Fi 5)
        - Frekvenciasáv: 5 GHz.
        - Sebesség: akár 6.9 Gbps vagy több.
        - Multiple-User Multiple-Input Multiple-Output (MU-MIMO): Több felhasználó egyidejű hozzáférését teszi lehetővé a vezeték nélküli hálózathoz és a hozzáférési ponthoz; switchként működik.
    - Wireless ax (802.11ax / Wi-Fi 6)
        - Frekvenciasáv: 2.4 GHz, 5 GHz és 6 GHz (Wi-Fi 6e).
        - Sebesség: akár 9.6 Gbps.
        - MU-MIMO technológiát használ a fokozott egyidejű felhasználói hozzáféréshez.
        - Teljesen visszafelé kompatibilis az előző szabványokkal.
    - Fontos Vizsga Pontok
        - Támogatott frekvenciák: 2.4 GHz (b, g, n, ax), 5 GHz (a, n, ac, ax), 6 GHz (ax).
        - A nagyobb sebességek gyakran rövidebb lefedettségi távolságokkal járnak egyetlen hozzáférési pont esetén.
        - Figyelembe kell venni a kompatibilitást és a frekvenciasávokat a hibaelhárítási forgatókönyvekben.
        - Ne támaszkodjon marketing anyagokra a vizsgán, tartsa magát a hivatalos szabványokhoz.
### 5. Vezeték Nélküli Biztonság
- A vezeték nélküli hálózatok kényelmet kínálnak, de könnyű hozzáférésük miatt biztonsági kockázatokat is jelentenek; a megfelelő hitelesítés és titkosítás elengedhetetlen a hálózati biztonsághoz.
    - Hitelesítési Mechanizmusok
        - Előre Megosztott Kulcs (Pre-Shared Key - PSK): Megosztott kulcs a hozzáférési pont és az ügyféleszközök között; skálázhatósági problémák nagy környezetekben, az egyéni felelősség hiánya; nem praktikus nagy irodai környezetekben.
        - Vállalati Hitelesítés (Enterprise Authentication): Egyedi felhasználói hitelesítő adatokat használ, amelyeket egy hitelesítési szerver (pl. RADIUS) kezel.
            - 802.1X Hitelesítési Rendszer: A legszélesebb körben használt vállalati szintű hitelesítési módszer; RADIUS-ra támaszkodik a felhasználói hitelesítő adatok kezeléséhez; egyéni felhasználói hitelesítést és jobb biztonsági protokollokat biztosít.
    - Vezeték Nélküli Biztonsági és Titkosítási Opciók
        - Wired Equivalent Privacy (WEP)
            - Az eredeti vezeték nélküli biztonsági szabvány (1999), amely gyenge titkosítás és sebezhetőségek miatt nem biztonságos.
            - Előre megosztott kulcsra támaszkodik (40 bites, 64 bites, 128 bites).
            - A gyenge Rivest Cipher 4 (RC4) titkosítási mechanizmust használja.
            - Inicializálási Vektor (IV): 24 bites, sima szövegben küldik el, ami sebezhetővé teszi.
            - Túl sok inicializálási vektor elfogásával könnyen feltörhető olyan eszközökkel, mint az Aircrack-ng.
        - Wi-Fi Protected Access (WPA)
            - A WEP felváltására fejlesztették ki az IV sebezhetőségek kezelésére.
            - Az IV-k helyett a Temporal Key Integrity Protocol (TKIP)-et használja a biztonság fokozására.
                - A TKIP hosszabb, 48 bites vektort használ, és az RC4 titkosítást kiegészítő funkciókkal.
                - Üzenetintegritás-ellenőrzés (MIC): Integritás-ellenőrzést végez az On-path támadások megelőzésére; az adatokat átvitel előtt hash-eli az integritás ellenőrzésére.
            - Vállalati Mód (Enterprise Mode): Egyéni hitelesítésre szolgál egyedi felhasználónevek és jelszavak használatával egy hitelesítési szerveren (pl. RADIUS) keresztül; erősebb titkosítási módszereket, jobb skálázhatóságot és központosított kulcskezelést kínál.
        - Wi-Fi Protected Access 2 (WPA2)
            - Felváltotta a WPA-t (2004-ben vezették be, a 802.11i szabvány része).
            - Erősebb integritás-ellenőrzést, jobb titkosítást és továbbfejlesztett hitelesítést kínál.
            - CCMP: Fokozott biztonságot nyújt, kombinálva az üzenetintegritás-ellenőrzést átfogó titkosítási protokollokkal a bizalmas adatok és az integritás biztosítására.
            - Advanced Encryption Standard (AES): Felváltotta a kevésbé biztonságos RC4 titkosítási algoritmust (128 bites, 192 bites, 256 bites); a legtöbb WPA2 hálózat 128 bites AES-t használ.
            - Személyes mód (PSK): Előre megosztott kulccsal, otthoni vagy kis irodai hálózatokban gyakori.
            - Vállalati mód: Nagyobb környezetekhez ajánlott, központosított hitelesítési szervereket használ a felhasználói érvényesítéshez.
        - Wi-Fi Protected Access 3 (WPA3)
            - 2018-ban vezették be, továbbfejlesztett funkciókkal.
            - Simultaneous Authentication of Equals (SAE): Fokozza a Wi-Fi hitelesítésben használt kézfogási folyamatot; felváltja a PSK módszereket egy biztonságosabb hitelesítési mechanizmussal, amely a Dragonfly kulcscsere protokollon alapul.
            - Lassítja a brute force támadásokat azáltal, hogy minden jelszókísérlethez aktív interakciót igényel a hozzáférési ponttal.
            - Előremutató titkosságot (forward secrecy) biztosít, garantálva, hogy a múltbeli kommunikáció biztonságosan titkosított marad, még akkor is, ha egy munkamenetkulcs kompromittálódik.
        - Wi-Fi Protected Setup (WPS)
            - Egyszerűsíti a biztonságos hálózatbeállítást PIN vagy nyomógomb használatával.
            - A PIN sebezhetősége miatt brute force támadásokra sebezhető.
            - Ajánlott kikapcsolni a WPS-t a nagyobb biztonság érdekében.
    - Kulcsfontosságú Vizsga Tippek
        - Nyílt hálózatok: nincsenek biztonsági intézkedések.
        - WEP: Inicializálási Vektor (IV) sebezhetőségek.
        - WPA: TKIP és RC4 titkosítással van összekapcsolva.
        - WPA2: CCMP-t használ az integritáshoz és AES-t a titkosításhoz.
        - WPA3: bevezeti az SAE-t és a Dragonfly kulcscserét.
        - WPS: nyomógombos konfigurációt foglal magában, de a biztonság érdekében ki kell kapcsolni.
        - PSK: személyes módú hitelesítés.
        - Vállalati mód: egyéni felhasználói hitelesítés központosított szerveren keresztül (pl. RADIUS 802.1X-el).
### 6. Captive Portálok
- A captive portálok olyan weboldalak, amelyeket a modern vezeték nélküli hálózatokban vendég hozzáféréshez használnak.
- Gyakran megtalálhatók nyilvános hálózatokban (hotelek, repülőterek, kávézók) és üzleti vendéghálózatokban.
- A felhasználó hálózati kapcsolatának elfogásával és egy speciális weboldalra való átirányításával működnek.
    - Funkciók
        - Hitelesítés: A felhasználó hozzáférési jogainak ellenőrzése bejelentkezési adatokon keresztül.
        - Szabályzat Elfogadása: A felhasználók elfogadják a szolgáltatási feltételeket vagy használati szabályzatokat.
        - Adatgyűjtés: Felhasználói adatok (pl. e-mail címek) gyűjtése marketing célból.
    - Használati Forgatókönyvek: Vendéghálózatok, biztonság fokozása, márkaépítési lehetőség.
    - Tervezési Szempontok
        - Felhasználói Élmény: Biztosítani kell a könnyű navigációt és a világos utasításokat.
        - Megfelelőség: Meg kell felelni az adatvédelmi törvényeknek (pl. GDPR).
        - Kompatibilitási Tesztelés: Biztosítani kell a funkcionalitást különböző eszközökön és böngészőkön keresztül.
    - Kulcspontok: Kulcsfontosságú a nyilvános és vendég vezeték nélküli hálózatok számára; egyensúlyt teremt a felhasználói hozzáférés és a hálózati biztonság között; javítja a felhasználói élményt és segíti a jogi megfelelőséget; gondos tervezést, biztonsági és megfelelőségi szempontokat igényel.



