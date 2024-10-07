Rendben srácok, ebben a videóban a betűkkel foglalkozunk, különösen a font-family és font-size tulajdonságokkal.

Valószínűleg különböző weboldalakon és felhasználói felületeken szeretne majd eltérő betűtípusokat használni. Megnézzük, hogyan teheti ezt meg. A webes biztonságos betűkről és a Google Fontshoz hasonló egyéb forrásokból származó betűtípusok használatáról is beszélünk.

Hozzunk létre itt egy új fájlt 03_fonts.html néven. Beillesztjük a sablonunkat, majd legördülünk, és egyszerűen "Betűkre" változtatjuk a címet. Ezután beillesztjük a stíluscímkéket a CSS-ünkhöz. Ezután az utolsó fájlból másoljuk be a szelektorokat, csak a két div-et, amelyek itt vannak a HTML-ben, hogy szövegmegjelenítésként használhassuk őket.

Mentenem kell ezt, majd meg kell nyitnom a Live Serverrel. Egy kicsit nagyobbra állítom. Lenyomom a Control billentyűt és a plusz szimbólumot nyomom meg, hogy egy kicsit nagyobbak legyenek. Rendben van.

A stílusunkban itt hozzáadunk egy szelektort a body elemhez. Itt szokás hozzáadni a font-family tulajdonságot, mert így az egész oldalra hat, igaz? Tehát a betűtípusokat az egész oldalra szeretnénk alkalmazni.

A font-family tulajdonságot akarjuk használni, amely egy betűkészlet-vermet fogad be, vagyis lényegében különböző betűtípusok listáját. A VSCode-ban pedig ezt a praktikus legördülő menüt kapjuk meg, ahonnan választhatunk betűkészlet-vermek közül. De mielőtt ebbe belemennénk, vessünk egy pillantást a webes biztonságos betűtípusokra.

A serif betűtípusnak lényegében vannak ezek a szélek, ezek a pontok a széleken, míg a sans-serif betűtípus inkább laposnak tűnik. Általában a sans-serif betűtípusokat érdemes használni, mert egyszerűen tisztábbnak tűnnek. Sokkal modernebbek is, részben azért, mert a Times New Roman, ami egy nagyon jellegzetes serif betűtípus, az alapértelmezett beállítás. Rendben. Tehát ha nem adunk meg font-family tulajdonságot, akkor ez a Times New Roman betűtípus lesz használva. Néhány kedvenc webes biztonságos betűtípusom az Arial, a Verdana és a Tahoma.

Térjünk vissza a VSCode-hoz és a Chrome-hoz. Alapértelmezés szerint, ahogy mondtam, sans-serifet használ. Láthatja a kis pontot az "A" betű tetején. Nos, át akarom változtatni Arialre. A VSCode-ban, ha egyszerűen beírom az "A, Arial, Helvetica, sans-serif" szavakat, akkor ez valójában egy opció. Ez egy betűkészlet-verem. Ahogy említettem, először az Arielt fogja keresni, majd a Helvetica-t, végül pedig a sans-serifet. Ha elmentem ezt, láthatja, hogy laposabb megjelenésű betűtípussá változik. Próbáljunk ki valami mást, például a Verdanát. Ha beírom a "V" betűt, a Verdana fog megjelenni a legördülő menüben. Tehát a betűkészlet-vermünk Verdana, Geneva, Tahoma, sans-serif. Ha elmentem, kicsit más lesz, de továbbra is sans-serif betűtípus.

Rendben. Ha valami mást szeretne használni, valami olyat, ami nincs azon a listán, amit bemutattam, akkor a Google Fonts használatát javaslom.

Rendben, most megnyitok egy új böngészőt, és kicsit nagyobbra állítom. Látogassunk el a fonts.google.com oldalra. Itt kereshet bizonyos betűtípusokat, böngészhet közöttük, ha szeretné, és megtekintheti a mintáikat is. Nekem tetszik a Roboto, ezt használom elég gyakran, és láthatja, hogy itt felugrik. Van Roboto, Roboto Condensed, Roboto Mono és Slab.

Tegyük fel, hogy a Roboto betűtípust szeretnénk használni. Kattintsunk erre a plusz jelre itt, és megjelenik egy kis felugró ablak. Ha rákattintunk, megmutatja, hogyan integrálhatjuk a HTML-be a link címke használatával, ugyanúgy, mint a normál CSS-fájloknál. Importálhatjuk a CSS-be is, mint itt látható. Általában importálom, de mivel a CSS-t a HTML-fájlba helyezzük, most csak a linket fogom használni.

Rendben, ha lemásoljuk ezt, megmutatja, hogyan valósíthatjuk meg. Egyszerűen hozzáadhatjuk a font-family tulajdonságot, majd a "Roboto sans-serif" értéket. Térjünk vissza a VSCode-hoz, és nyissuk meg a másik böngészőt. Menjünk közvetlenül a cím fölé, és illesszük be ezt a linket.

Rendben, a link a "https://fonts.googleapis.com/css?" címre mutat, és paraméterként a "family" egyenlő "Roboto" értékkel rendelkezik. Tehát most már beírhatjuk a "Roboto" szót, ahogy mondták, majd a "sans-serif" szót, és ha elmentem, láthatja, hogy elég szép és tiszta lett.

A Roboto betűtípus nagyon tetszik. Tehát így használhatunk olyan betűtípusokat, amelyek nem webes biztonságosak.

Rendben, a következő dolog, amit meg szeretnék nézni, a font-size (betűméret).

Az alapértelmezett érték 16 pixel, és ez valójában a html címkén található. Az html címke alapértelmezett betűmérete 16 pixel. Ezért látja, hogy kicsit nagyítva van a tartalom. Tényleg visszaállítom 100%-ra. Control és a mínusz gomb, így már 100%-os.

Tehát változtassuk meg 18 pixelre (csak hogy bemutassam). Mentés, és most láthatja, hogy nagyobb. Beállíthatjuk a sortávolságot (line-height) is, ami lényegében az egyes sorok magassága. Ez általában em egységben van megadva, ami egy relatív egység. Később részletesen kitérek az em és a rem egységekre, szóval ne aggódjon, ha nem teljesen érti most ezt.

A test (body) sortávolságára gyakran használt érték az 1.6em. Mentés, és most láthatja, hogy több hely van a sorok között. Így tisztábbnak tűnik.

Most pedig beszéljünk egy kicsit az egységekről, például a pixelekről, az em-ről és így tovább. Nézze meg ezt a CSS-egységek listáját. Vannak abszolút egységek és relatív egységek is. Lehet, hogy kicsit túl soknak tűnik, de ne aggódjon, mert ezek többségét nem használjuk.

Valójában az egyetlen dolog, amit ezen az oldalon használni fogunk, az a pixel. A pixel a leggyakoribb abszolút egység, amit használni fog. Használhat centimétert, millimétert, hüvelyket is. Beállíthatja a betűméretet egy hüvelykre is, ha szeretné, de ez valószínűleg nem valami gyakori. A pixel használata a leggyakoribb, és 1 pixel pontos mérete 1/96 hüvelyk.

Léteznek még pontok is. A pontok ismerősek lehetnek a Microsoft Wordből, és 1 pont 1/72 hüvelyk.
Lehet, hogy találkozik Pontokkal is, de a legtöbb esetben Pixeleket fog látni. Vannak még Picák is, amelyek valójában 12 pontnak felelnek. Rendben, ezt valószínűleg nem nagyon fogja látni. Most vannak relatív egységek is, amelyekkel később fogok foglalkozni, most nem erre koncentrálok igazán. Például van százalék, beállíthatja egy szülő elem százalékára, és egyébként ez nem csak a betűméretre vonatkozik, hanem a margóra, a kitöltésre, a sortávolságra, vagyis a szélességre, a magasságra és így tovább.

Szintén léteznek em és rem egységek. Az em gyakorlatilag egy szorzó, tehát bármilyen méretű legyen is a szülő elem, például ha a szülő div egy bekezdéshez tartozik, és 16 pixel, és 1em-re állítja, az 16 pixelnek lesz egyenlő. Ha 1,2 em-re állítja, az 16 pixel szor 1,2-nek lesz egyenlő. A rem egységek ugyanúgy működnek, csak a szülő elem helyett a gyökér HTML elemet használják, amely alapértelmezés szerint 16 pixel. Tehát ha 1rem-re állítja, alapértelmezés szerint 16 pixelre lesz állítva, és ha ez nagyon zavaró az Ön számára, ne aggódjon, később részletesen kitérek ezekre a dolgokra. Most még a viewport-width-tel és a viewport-height-tal sem fogok foglalkozni.

Rendben, térjünk vissza a VSCode-ba, és visszaállítom a font-family tulajdonságot Arial-ra, vagyis Arial, Helvetica, sans-serif értékre, és csak még néhány betű tulajdonságot szeretnék bemutatni. Tehát meg szeretném nézni a font-weight (betűsúly) és a font-style (betűstílus) tulajdonságokat, amelyek nagyon egyszerűek.

Alapvetően ezeket a tulajdonságokat arra használják, hogy a szöveget félkövérre vagy dőlt betűre állítsuk. Szóval beillesztek itt egy span címkét. Legyen ez span. Lemásolom a záró címkét itt (Ctrl+C), beillesztem oda (törlés után), és egy másik span címkét is beillesztek lejjebb. Ó, javítás: span, majd lemásolom a záró címkét, és beillesztem lejjebb.

Rendben, mentsük el ezt, majd menjünk fel ide. Meg akarom mutatni, hogyan lehet ezeket a span elemeket célzottan módosítani. Az elsőhöz például a welcome div-be szeretnénk lépni. A div azonosítója welcome, majd a bekezdésbe, végül pedig a span-be. Így célozhatjuk meg ezt az első span elemet. Technológiailag a bekezdésre sincs feltétlenül szükség, mert a rendszer így is megtalálja ezt a welcome azonosítójú div-et, majd a span-t, de szerintem rendezettebb a kódot így tartani a bekezdéssel együtt.

Rendben, csak egy extra lépésként tegyük fel, hogy a font-weight tulajdonságot félkövérre szeretnénk állítani. Figyelje meg, hogy a VSCode lehetőségeket kínál a félkövérség fokának megadására számokkal, de most egyszerűen csak a félkövér opciót választjuk, és mentjük a módosítást. Látja, hogy most a span-ben lévő szöveg félkövér lett.

Tehát a strong címke használatához hasonlóan a CSS-ben is félkövérre állíthatjuk a szöveget. Céljuk meg ezt az alsó span-t az about div, bekezdés, span elérési útvonal használatával. Állítsuk a font-style tulajdonságot dőlt betűre, mentsük el, és most már láthatja, hogy a szöveg dőlt betűs lett, bár kissé halvány.

Tehát ezek a betűkkel kapcsolatos tulajdonságok. A következő videóban a színekkel szeretnék foglalkozni. Láthatta, hogy például a piros és zöld színneveket használtam. Ezen kívül használtam ezt a furcsa dolgot is, a #-et, majd néhány betűt, ez a hexadecimális színkód. Van még RGB színkód is. Szóval meg szeretném vizsgálni a színeket és a különböző típusokat, amelyeket a CSS-ben használhatunk.