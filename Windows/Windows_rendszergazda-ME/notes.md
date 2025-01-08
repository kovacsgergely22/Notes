# A Windows Server 2008 R2 menedzselése [^1]

## 1. fejezet - Elméleti háttér

### 1.1. Bevezetés

A mai világban számítógépet nagyon sokan használnak. A használatot nagymértékben befolyásolja, hogy milyen operációs rendszer üzemelteti azt. Az operációs rendszereket nagyon sok szempont szerint lehet csoportosítani, még akkor is, ha a szakmai jellemzőket figyelmen kívül hagyjuk. Szempont lehet, hogy az operációs rendszer mennyire felhasználóbarát, vagy mennyire biztonságos, esetleg cserélhető-e a grafikus felülete, stb. A felhasználók egy része folyamatosan igyekszik meggyőzni másokat az általa használt operációs rendszer előnyeiről. Ennek során azonban (talán annak megszokása miatt) nem említi hátrányait.

A PC-s világban a felhasználókat jórészt két nagy csoportba lehet sorolni: az egyik csoport a Microsoft Windows valamelyik változatát használja, míg a másik csoport valamilyen Unix-szerűt. A második csoport listája nagyon hosszú is lehet, hisz’ ide sorolják az összes Linux variánst, és a Mac OS X különböző verzióit is, főként azóta, hogy az Apple áttért az Intel processzor család használatára.

Nem szándékom egyik csoport mellett se letenni a voksomat. Tanszékünkön (Miskolci Egyetem, Általános Informatikai Tanszék) a hallgatók mindkét operációs rendszer esetében választhatnak „Rendszergazdai ismeretek” című tárgyat (Unix esetében egy Linux változatra építve). Windows esetében ez a tárgy jellemzően az épp rendelkezésre álló szerver változatra épül.

Jelenleg a legfrissebb szerver változat a Windows Server 2008 R2, amely 2009 év végétől érhető el (MSDN előfizetéssel 2009. augusztus 14.). A megjelenés óta bő 1 év telt el. Bár idegen nyelvű szakkönyvek a közel múltban jelentek már meg, de magyar nyelvű a mai napig (2011. február) nem érhető még el a szokásos kiadók gondozásában (Szak Kiadó, Panem Kiadó, Kiskapu Kiadó), és érdekes módon a Microsoft hivatalos kurzusai között is mindössze 1 olyan található, amely a Server 2008 R2-vel foglalkozik. Ez egy ún. update tanfolyam Server 2008-ról 2008 R2-re (10159A – Updating Your Windows Server 2008 Technology Skills to Windows Server 2008 R2).

Ez a jegyzet (terjedelméből adódóan) nem fedi le teljes mértékben egy rendszergazda tevékenységét (az ilyen könyvek 1400-1800 oldalasak is lehetnek). Főként a fogalmakkal, a Windows-os rendszer jellegével akar megismertetni. Az elméleti rész megáll a felhasználók és csoportok megismertetésénél, a gyakorlatok azonban tovább bővítik az ismeretanyagot.

Cél, hogy a hallgató az elméletet megértve, és a gyakorlati példákat teljesítve képes legyen önállóan egy rendszer üzemben tartására, a használt operációs rendszer főbb jellemzőinek megértésére. Ne okozzon gondot egy tetszőleges rendszer szűk keresztmetszetének megkeresése, vagy egy-egy szoftver telepítése.

Javasolt a gyakorlatokat vezető oktatónak a gyakorlatokat előre tesztelnie, mert telepítéstől függően elképzelhető, hogy egyes gyakorlatokat a helyi jellemzők függvényében módosítani kell.

A foglalkozások javasolt kivitelezése: a nagyobb hatékonyság érdekében minden téma esetében először vagy a jegyzet, vagy más forrás segítségével az elméleti ismereteket kell tisztázni, majd ezután kerüljön sor az elmélethez kapcsolódó gyakorlatra. A gyakorlatok több esetben egymásra épülnek, ezért nem javasolt egy-egy gyakorlatot kihagyni, mert a későbbiek során előfordulhat, hogy valamely gyakorlat nem, vagy csak kerülő úton lesz elvégezhető.

### 1.2. A Windows termékvonala

A Microsoft Windows operációs rendszere alapvetően két fő vonulatra osztható: mindvégig jól elkülöníthető az otthoni felhasználóknak, illetve a vállalati felhasználóknak szánt termékcsoport. Ennek szerepe még a Windows 95 operációs rendszer megjelenéséhez köthető. Az előző változat, a Windows 3.1 illetve Windows 3.11 még DOS-ból, és külön paranccsal indult.

#### 1.2.1. Korai változatok

A DOS-os programok jellemzően egyedül birtokolták a memóriát, a CPU-t, stb. (Természetesen az interrupt rendszer segítségével már valósultak meg „multitask”-os programok, de ez nem igazi multitask). Előre nem tervezett esetekben ekkor előfordulhatott az is, hogy az alkalmazás nem adta vissza a CPU-t a DOS-nak, hanem kizárólagosan használta azt (akár a programozó hibájából). A Windows 3.1 után megjelenő új Windows verziónál a Microsoft döntés elé került. Vagy készít egy olyan operációs rendszert, amely kizárja ezeket a hibákat (nem engedi futni a rosszul megírt alkalmazásokat) és egy stabil rendszer lesz, vagy hagyja a régi rendszert tovább élni.

Az első választás következményeként a felhasználók „jogosan” morogtak volna, hiszen azok a régi hibás alkalmazásaik, amik DOS alatt hibátlanul futottak, azok a Windows 95 alatt nem lettek volna működőképesek. A következmény nyilvánvaló…

A másik választás esetében pedig készül egy új operációs rendszer, ami csak felületében és szolgáltatásaiban tér el a DOS-tól.

Természetesen ez kicsit sarkított vélemény, de a lényeget jól mutatja. Belátható, hogy végül is nem volt igazi alternatíva, hiszen a felhasználók az első esetben nem vásárolják meg otthonra az új Windows-t.

A gond azonban nem oldódott meg. Vállalati környezetben a felhasználók javarészt nem korábbi játékaikkal játszanak. A vállalat pedig előbb-utóbb a stabil operációs rendszer használatának érdekében korábbi, esetleg bizonytalan alkalmazásait újraírathatja. Ezért kettéválasztották a Windows termékvonalat. Az otthoni felhasználóknak készült a Windows 95, a Windows 98, a Windows 98 SE, a Windows Milennium. A vállalati felhasználóknak pedig a Windows NT 4.0, és a Windows 2000.

#### 1.2.2. Windows XP – Windows Server 2003

A Windows XP megjelenésekor a Microsoft egyesítette a két vonalat. Az otthoni felhasználók is megkapták a stabil operációs rendszer memória-, és task kezelését, ennek következtében néhány inkorrekt módon megírt alkalmazás az XP-n már nem fut. Az otthoni felhasználók szokásainak vizsgálatával a Microsoft kiválogatta azokat a szolgáltatásokat, amikre valószínűleg nem lesz szükség. Ezeket a Windows XP egy másik változatába tette be. Így végül is az XP-ből két változat készült: a Home és a Professional változat. XP-ből azonban nem készült ún. kiszolgáló (server) változat. Ezt a Microsoft a Windows Server 2003-mal pótolta. Ezután a fejlesztés követhetőbbé vált, hiszen minden Windows változat innentől kezdve ugyanazt az irányt követte, az operációs rendszer stabilizálását. Így már csak 1 kernel-t kellett fejleszteni, és az abban levő hibákat javítani.

#### 1.2.3. Windows Vista – Windows Server 2008

Következő kliens a Windows Vista volt (2006. november 8.), aminek fejlesztésekor a Microsoft az addig érvényes trendeket követve (folyamatosan eső memória árak, növekvő memória méretek, gyorsabb processzorok, növekvő merevlemez kapacitás) elkövette azt a hibát, hogy igen erőforrás igényes lett. Elsősorban memóriából igényelt sokat, főként a grafikus felület felgyorsítása miatt. Utólag már látható, hogy a felhasználók (jellemzően a magas memória árak miatt) nem nagyon fejlesztették PC-s rendszerüket. Mivel a Windows XP is az évek múlásával egyre kedveltebb és stabilabb lett (a korábban sűrűbben előforduló úgynevezett „kék halál”-ról sok felhasználó már csak hallomásból tudott), nem volt igazán ok sem a Vistá-ra való áttérésre. Akik gyengébb PC-jükön mégis megpróbálkoztak vele, (hiszen a telepítés kevesebb memóriával rendelkező gépekre is lehetséges volt), azok rövidebb-hosszabb idő elteltével többnyire megint Windows XP-t használtak, és Vistá-val kapcsolatos panaszaiknak hangot is adtak. Azt is fontos megemlíteni, hogy a Microsoft a korábbi biztonsági hiányosságok miatt úgy döntött, hogy minél teljesebb mértékben igyekszik a következő operációs rendszerét újraírni. Emiatt újabb programozói- és biztonsági hibák is bekerülhettek a kernel-be. Az itt megjelenő, talán kicsit túl érzékeny biztonsági rendszert (a sok port kavart UAC – User Access Control) a felhasználók nehezen fogadták el, és több alkalmazás sem volt emiatt működőképes.

Közel másfél évvel később erre a kernel-re építve elkészült a szerver változat, a Windows Server 2008 (2008. február 27.). Az addig megtalált hibákat javították, és mivel egy szerver eleve több memóriával rendelkezik, ez a változat az üzemeltetők között sikeres lett.

#### 1.2.4. Windows 7- Windows Server 2008 R2

A Vista hardverigényén csökkentve (a grafikus rendszer működésének alapjait átírva), újabb felülettel, újabb szolgáltatásokkal kibővítve elkészült a Windows 7 (2009. október 22.). A korábban hozzáférhetővé tett előzetes kiadásokat a szakújságírók tesztelték, és dicsérték. Emiatt a felhasználók is nagyon várták a végleges változatot. A piaci mutatók szerint a Windows 7 mostanra kedvelt, elterjedt operációs rendszer lett, pedig nincs lényeges változtatás a Vistá-hoz képest.

Ugyanebben az időben (2009. október 22.) megjelent a frissített szerver változat is, a Windows Server 2008 R2. GUI-ja (Graphical User Interface – grafikus felhasználói felület) a Windows 7-é, szolgáltatásai jellemzően a Windows Server 2008-é.

A következő táblázatban összefoglalva láthatók a különböző (fontosabb) Windows változatok, kernel-jük verzió száma, és az úgynevezett kibocsátási alverzió (RTM – Release To Manufacturing). Itt megfigyelhető, hogy az egyes változatok valóban mennyire egymásra épülnek.

1.1. táblázat - Windows verziók

| Név, verziók |	Kernel |	RTM |
| Windows NT 4.0 Workstation, Server, Enterprise  Server | NT 4.0 |	1381 |
| Windows 2000 Professional, Server, Advanced Server | NT 5.0 | 2195 |
| Windows XP Home, Professional | NT 5.1 | 2600 |
| Windows Server 2003 Web, Std, Adv., Enterp. Datacenter | NT 5.2 | 3790 |
| Windows Vista Starter, Home Basic, H-Premium, Enterprise | NT 6.0	| 6000 |
| Windows Server 2008 Web, Std, Enterprise, Datacenter | NT 6.0	| 6001 |
| Windows 7 Starter, Home Basic-Premium, Prof, Enterp, Ultim. | NT 6.1 | 7600 |
| Windows Server 2008 R2 Web, Std, Enterprise, Datacenter | NT 6.1 | 7600 |

### 1.3. A Windows Server 2008 R2 és kiadásai

A kicsit hosszúra nyúlt változatok ismertetése után nézzük a Windows Server 2008 R2-t (W2K8R2) részletesebben. Telepítés előtt (tulajdonképpen már a vásárláskor) tudnunk kell, milyen változatok állnak rendelkezésre, és az egyes változatok miben különböznek egymástól.

Windows Server 2008 R2 Foundation: ez a legegyszerűbb változat, több kötöttséggel. Legfeljebb 1 processzort képes kezelni, és maximum 8 GB-t memóriát. Bár ez még több cégnek elegendő is lenne, de 15 főben korlátozzák a felhasználók számát. Emiatt leginkább egy kis iroda működtetéséhez elegendő. Képes tartományt kezelni, illetve már létező tartományba is beléptethető bizonyos korlátozásokkal.

Windows Web Server 2008 R2: egy meglehetősen érdekes kiadás. Bár nevéből is adódóan elsősorban Web (és alkalmazás) szerver futtatására tervezték, és ennek megfelelően korlátozások vannak benne, de ugyanakkor vannak olyan jellemzői, amelyekben ugyanazt tudja, mint a nagyobb (Standard) kiadás: maximum 4 db 64 bites processzor, legfeljebb 32 GB memória, 2 Remote Desktop Admin csatlakozási lehetőség. Tudja futtatni a Microsoft SQL szervert, és képes hálózati szolgáltatásokat is nyújtani (DNS – Domain Name System, integrálva tartalmazza az IIS 7.5 – Internet Information Services 7.5, az ASP.NET-et, a Microsoft .NET Framework-öt).

Windows Server 2008 R2 Standard: ez a legáltalánosabb verzió. Főként kiszolgálók operációs rendszereként használják, például SQL szerverhez. Támogatja a komolyabb hardver kiépítést: maximum 4 db 64 bites processzor, legfeljebb 32 GB memória. További jellemzői a Hyper-V alapú virtualizáció, az IIS 7.5, és a legfeljebb 250 egyidejű hálózati kapcsolat. Képes hálózati szolgáltatások nyújtására (DNS, DHCP – Dynamic Host Configuration Protocol). Ugyanakkor nem támogatja a cluster-ezést, a DFS-R-t (cross-file replication), és az AD FS-t (Active Directory Federation Services). Javasolt felhasználási terület még a fájl szerver, a nyomtató szerver, a média szerver, és a SharePoint szerver.

Windows Server 2008 R2 Enterprise: mindent tud, amit a Standard Edition. Ahhoz képest azonban jelentős bővüléseket találhatunk: korlátlan számú hálózati kapcsolatok, maximum 2 TB memória, 8 db 64 bites processzor, 16 node-os cluster kialakítás. Ha a hardver is támogatja, bővíthető működés közben a memória. Megfelelő kliensek esetén a távoli irodák (fiók irodák - branch office) hatékonyságát növeli a hálózati forgalom csökkentésével (BranchCache).

Windows Server 2008 R2 Datacenter: gyakorlatilag nincsenek benne korlátozások. Hardvertől függően működés közben akár processzorok is adhatók hozzá, illetve cserélhetők. Korlátlan számú virtuális image használati jog, korlátlan számú hálózati- és VPN kapcsolat, 64 db 64 bites processzor (4 magos processzorok esetében ez 256 logikai processzor).

### 1.4. Számítógépek, és logikai csoportok

A Windows-t futtató gépekből telepítéskor, illetve telepítés után logikai csoportok képezhetők. Ezekkel egy otthoni felhasználó általában nem foglalkozik, nem is találkozik, használja az alapértelmezés szerinti (default) beállításokat. Kétféle logikai csoportot különböztetünk meg: a tartományokat (domain) illetve a munkacsoportokat (workgroup).

#### 1.4.1. Munkacsoport (Workgroup)

A kettő közti különbség megértése érdekében vegyünk egy példát. Ahhoz, hogy egy felhasználó dolgozni tudjon egy adott számítógépen, be kell tudnia arra jelentkezni. Munkacsoport esetén minden gépen minden olyan felhasználót létre kell hozni, akinek azon a gépen dolgoznia kell. Bár ez nagyobb létszám esetében hosszabb időt igényel, mégis dönthet emellett a rendszergazda, abból kiindulva, hogy csak egyszer kell sokat dolgoznia. Igaz, ha később újabb gépek jönnek, azokon is létre kell hozni a felhasználókat, de feltételezheti, hogy ez már viszonylag ritkábban fog előfordulni. A felhasználóktól elvárás, hogy a nagyobb biztonság érdekében összetett jelszavakat használjanak, és azokat bizonyos időközönként változtassák meg. A munkacsoport esetében a felhasználók adatai (köztük a belépéshez szükséges jelszó is) minden egyes számítógépen külön-külön tárolódnak. Ha két számítógépen azonos nevű felhasználó van (pl.: KovacsP), akkor sincs köztük kapcsolat, úgy kell tekinteni, mintha egy tankörbe véletlenül két olyan Szabó, vagy Nagy, vagy Kovács kerülne, akik között nincs semmilyen rokonsági kapcsolat.

Ha a felhasználó az egyik számítógép elé ülve módosítja a jelszavát, akkor a jelszó csak azon a számítógépen módosul, a többi gépen nem. Ha a napok múltával különböző számítógépekre jelentkezik be, és azokon módosítja a jelszavát, akkor előbb-utóbb nehéz lesz követnie, melyik számítógépen cserélte már le, és melyiken nem a jelszavát. Ilyenkor általában bevezetésre kerül egy papír fecni, amin igyekszik ezt valamilyen módon nyilvántartani. Ahogy telik az idő, előfordulhat, hogy lesz olyan számítógép, amelyiken már többször is cserélte a jelszavát, és olyan is, amelyiken még egyáltalán nem…

A számítógépek időnként elromolnak, ekkor szervizbe viszik. Ha egy adott idő alatt több számítógép kerül szervizbe, majd javítás után onnan vissza, a rendszergazda szempontjából sokszor nem lényeges, hogy az egyes gépek a laborban korábban hol voltak. A papír fecni alapú nyilvántartás ettől kezdve szétesik, mert a 3. sor 2. számítógépe visszakerülhet a 4. sor 5. helyére.

Összefoglalva: munkacsoportok esetén az adott számítógépre belépésre jogosult felhasználók adatai azon a számítógépen tárolódnak, ahol a felhasználót létrehozták, és a számítógépek között a nyilvántartás szempontjából nincs semmilyen kapcsolat.

#### 1.4.2. Tartomány (Domain)

Tartományoknál (most egy egyszerűsített esetet nézve) van egy kitüntetett számítógép, amely több más mellett a felhasználók adatait (köztük a jelszót) is tárolja. A többi számítógépen beállításra kerül, hogy a jelszót (és a többi adatot) honnan kell „lekérni” annak érdekében, hogy a bejelentkezés jogosságát ellenőrizni lehessen. (FONTOS: az ellenőrzés ugyan nem pont így történik, de így könnyebb a tartomány szerepét megérteni.) Sikeres bejelentkezés esetén, ha a felhasználó módosítja a jelszavát, akkor a jelszó ezen a központi számítógépen fog megváltozni, és letárolódni. A következő bejelentkezés történhet bármelyik számítógépen. Ha ellenőrzéskor „lekérésre” kerül a jelszó, akkor a már módosított jelszó kerül összehasonlításra. A kitüntetett számítógépet tartományvezérlőnek (DC - Domain Controller) nevezzük. A tartományvezérlőn lehetőség van más adatok letárolására is, amely adatok között a tartományba tartozó számítógépek keresni tudnak (pl.: megosztott nyomtatókat, megosztott mappákat). Ennek a központi adattárnak a neve címtár, és a Windows 2000-től kezdődően Active Directory (AD) néven hivatkozhatunk rá.

---

[^1]: Wágner György [Windows Server 2008 üzemeltetése](https://gyires.inf.unideb.hu/KMITT/c09/ch01.html) 