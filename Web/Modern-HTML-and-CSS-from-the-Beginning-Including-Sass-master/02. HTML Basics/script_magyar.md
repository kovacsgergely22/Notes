# HTML alapok

A **meta tagek** olyan kódrészletek, amelyek leírják egy oldal tartalmát. Nem jelennek meg az oldalon sehol, csak az oldal bizonyos attribútumait írják le. Nem fogom felsorolni az összes létező meta taget, de át fogjuk nézni az itt láthatóakat, valamint néhány fontosabbat is. Figyeld meg, hogy mindegyik tagekben szerepel a "meta" szó, a különbség az attribútumokban rejlik. Az attribútumok alapján különböző dolgokat végeznek. A legtöbb meta tag rendelkezik egy névvel, amely meghatározza, hogy mi az, és egy tartalommal, amely meghatározza az értéket.

**charset** - A charset meghatározza a weboldal karakterkódolását. Az UTF-8 a Unicode karakterkódolása. A '8' azt jelenti, hogy 8 bites blokkokat használ a karakterek ábrázolásához. Létezik UTF-16 is. Nem annyira fontos érteni, hogyan működik, valójában akkor is UTF-8 lesz az alapértelmezett, ha kihagyjuk. Tudni kell, hogy ez az előnyben részesített kódolás a weboldalak és az e-mailek számára is. A Unicode szabvány lefedi (szinte) az összes karaktert, írásjeleket és szimbólumokat a világon.

**viewport** - A viewport meta tag a felhasználó látható weboldal-területéhez kapcsolódik. Szabályozza a weboldal megjelenítésének méreteit és skálázását a böngészőben. Ez fontos a reszponzív dizájn szempontjából, amely azt jelenti, hogy a weboldalad jól néz ki és megfelelően működik egy mobil böngészőben, okostelefonon vagy táblagépen. Általában azt szeretnéd, ha ennek tartalma az itt látható módon lenne beállítva. A szélességet a készülék szélességéhez kell igazítani. Így, ha egy mobil eszközön nézed, nem lesz ráközelítve úgy, hogy a weboldal egy része vízszintesen le legyen vágva. Az initial-scale=1.0 beállítja a kezdő nagyítási szintet, amikor a böngésző először betölti az oldalt. Ahogyan itt be van állítva, gyakorlatilag úgy is kell hagyni. Ha ezt kihagyod, problémák adódhatnak mobil eszközökön.

Ez a **http-equiv** érték nem igazán érdekel. Régi böngészők, például Internet Explorer 8 és 9 támogatásával kapcsolatos. Ha szükséged van ezeknek a böngészőknek a támogatására, akkor szükséged lehet erre a tagre. Én csak azért hagyom itt, mert az Emmet automatikusan beilleszti. Az Emmetet be lehet állítani úgy, hogy eltávolítsa ezt, illetve bármely más meta tagot, de nem árt, ha itt van. Az Edge a Microsoft újabb böngészője, amely minden Windows gépen megtalálható, és gyakorlatilag azt mondjuk, hogy ezeket a szabványokat használja az IE-hez.

Rendben, nézzünk néhány más népszerű meta taget, amelyek a *keresőmotorokkal kapcsolatosak*. *Amikor a Google vagy a Bing átvizsgálja az oldaladat, hogy indexelje a keresőmotorban, néhány dolgot néz. Természetesen a weboldal tartalmát, a cím taget (title), amit eredményként használnak, és keresnek egy meta leírást is (meta description)*. Ha nincs meta leírás, akkor az oldal tartalmát fogják használni. Ha fontos neked, hogy hogyan jelenik meg az oldalad a keresőmotorokban, érdemes egy jó leírást adni. Ehhez egy meta taget kell hozzáadni, például...

**Kulcsszavakat** is hozzáadhatsz, hogy jobban leírd az oldal tartalmát. Ezek már nem nagyon befolyásolják a keresőoptimalizálást, de segítenek leírni az oldalt más okokból. Nem szükségesek, de nem árt hozzáadni őket. Így nézne ki...

Előfordulhatnak olyan esetek, amikor nem szeretnéd, hogy a keresőmotorok indexeljék az oldaladat. Megakadályozhatod, hogy átvizsgálják és indexeljék az oldalt a robots meta tag segítségével. Ha hozzáadjuk... A **NOINDEX** azt jelenti, hogy ne jelenjen meg ez az oldal a keresési találatok között, és a **nofollow** azt jelenti, hogy ne kövesse az oldal linkjeit. Akár megadhatod a googlebot-ot is a robots helyett, ha csak a Google-ben nem szeretnél megjelenni, de más keresőkben igen. Nem hiszem, hogy ezt gyakran használják, de lehetséges.
