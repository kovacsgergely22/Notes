# Dr. Adamkó Attila - Fejlett Adatbázis technológiák

![0](images/0.png)

![0v1](images/0v1.png)

---

1. [Dr. Adamkó Attila - Fejlett Adatbázis technológiák](#dr-adamkó-attila---fejlett-adatbázis-technológiák)
   1. [1. Bevezetés](#1-bevezetés)
   2. [2. XML alapok](#2-xml-alapok)
      1. [2.1. A névterek és az újrafelhasználhatóság](#21-a-névterek-és-az-újrafelhasználhatóság)
      2. [2.2. Érvényes XML dokumentumok](#22-érvényes-xml-dokumentumok)
         1. [2.2.1. XML dialektusok: DTD és XML séma](#221-xml-dialektusok-dtd-és-xml-séma)
            1. [2.2.1.1. Legfontosabb XML Schema elemek](#2211-legfontosabb-xml-schema-elemek)
      3. [2.3. Információtartalom és feldolgozási stratégiák](#23-információtartalom-és-feldolgozási-stratégiák)
         1. [2.3.1. Nyelvfüggetlen feldolgozási stratégiák: DOM és SAX](#231-nyelvfüggetlen-feldolgozási-stratégiák-dom-és-sax)
      4. [2.4. A dokumentumtervezés alapjai](#24-a-dokumentumtervezés-alapjai)
         1. [2.4.1. Leíró- és adat-orientált dokumentum struktúrák](#241-leíró--és-adat-orientált-dokumentum-struktúrák)
      5. [4.2. Építőelemek: attribútumok, elemek és karakteradatok](#42-építőelemek-attribútumok-elemek-és-karakteradatok)
   3. [***Leíró jellegű dokumentumokban***](#leíró-jellegű-dokumentumokban)
   4. [XML adatbázisok](#xml-adatbázisok)
   5. [XDM: az XPath és XQuery adatmodellje](#xdm-az-xpath-és-xquery-adatmodellje)
   6. [XPath](#xpath)
   7. [XQuery](#xquery)


[Könyv elérhetősége](https://gyires.inf.unideb.hu/GyBITT/12/)

---

## 1. Bevezetés

![0](images/0.png)

* XML nyelv és technológiák befogadása
* 1999 Tim Berners Lee - a WWW kidolgozója - Szemantikus Web program -> XML nyelv általános elterjedése -> XML dokumentumokra épülő adatbázisok
* XML adatbázisokat kezelő rendszerek alapvetően nem, vagy nem tipikusan XML struktúrákban tárolják az adatokat (felesleges terjengősség -> helypazarlás elkerülése)
* XML dokumentumok lekérdezésére -> W3C konzorcium ajánlásaként -> XQuery és XPath lekérdezőnyelv (2.0-s változatuktól közös adatmodellen alapulnak)
* Ma nem a felhasználók, hanem szoftverek (B2B) állítanak elő és dolgoznak fel automatikusan üzeneteket/lekérdezéseket ->
  * XML jól illeszkedik adatcsere eszközeként
  * jobb mint SQL alapú rendszerek
* Komplex módszerek XML dokumentumok tárolására, (erről nem szól a jegyzet)
* XML dokumentum szerkezeti kialakítása és az egyes megközelítések előnyének és hátrányának áttekintése
* Validálás szabványos technológiákkal

## 2. XML alapok

1. XML célkitűzései:
  * legyen egyszerűen használható a (webes)rendszerekben,
  * az alkalmazások széles körét támogassa,
  * legyen kompatibilis az SGML-el,
  * legyen egyszerű XML dokumentumokat feldolgozó programokat írni,
  * ember által is olvasható, világos szerkezetű dokumentumok legyenek,
  * legyen egyszerű XML dokumentumokat készíteni.
2. HTML és XML -> óriási különbségek
  * A HTML:
    * megjelenítésre koncentráló
    * nem bővíthető jelölésrendszer
    * laza (nem szabványos) szintaxiskezeléssel.
  * Az XML:
    * szigorú szintaktikai ellenőrzéssel rendelkezik,
    * bővíthető,
    * tartalom-orientált jelölésrendszer
* XML tágabban:
  * dokumentum formátum
  * metanyelv -> nyelvek definiálása
    * címkekészlet és struktúra (szókincs és nyelvtan) -> DTD és XML Schema
  * szabványcsalád -> több szervezet által is jegyzett alapszabványok
  * technológia -> sokféle alkalmazási terület
    * webes megjelenés
    * adatcsere - e-Business
    * szövegek reprezentációja és feldolgozása
    * szövegszerkesztők dokumentumformátuma (OpenOffice, MS Office)
    * web 2.0
    * technikai dokumentációk nyelvezete
    * szoftverek konfigurálása (ant, maven)
    * felhasználói interfészek definiálása (XUL)
    * EU önéletrajzok készítese (Europass) stb.
* XML lehetőségek:
  * szöveges formátum -> megjelenítés
  * strukturált -> tartalom, információelérés, adatcsere -> gépi úton is feldolgozhatók

### 2.1. A névterek és az újrafelhasználhatóság

* Újrafelhasználhatóság -> névterek
  * névütközések elkerülése különböző alkalmazások XML dokumentumainak keveredésekor
  * névtér = szintaktikai mechanizmus, egy adott név különböző környezetekben történő felhasználásának megkülönböztetésére 
  * A névtér minősített nevek végtelen halmaza

```
< névtérnév , lokális név >
```

* xmlns (XML Namespace) attribútum társítja a használni kívánt névteret a megadotthoz -> továbbiakban prefixként használva érhetők el a névtérben definiált elemek
* alapértelmezett névtér használata nélkülözhetővé teszi a prefixek használatát, de:
  * megnehezíti a keresést, hogy az elem melyik névtérbe tartozik
  * alapértelmezett névtér használata esetén a névtér csak az elemekre kerül alkalmazásra, az attribútumokra nem.
* alapértelmezett névtér törlése: például ->

```
<person xmlns:account="">
```

### 2.2. Érvényes XML dokumentumok

* **Jól-formázott** XML dokumentumok, amelyek logikai tartalma és felépítése teljesen megegyezik:
  * DTD-vel
  * XML Schemával
  * Relax NG segítségével
* Sémanyelvek célja a **validálás** -> XML-feldolgozó végzi és ellenőrzi
* A sémanyelvek **eszközrendszert** biztosítanak:
  * a dokumentumot alkotó elemek azonosítására szolgáló nevek definiálásához
  * annak szabályozására, hogy a dokumentum egyes elemei hol jelenhetnek meg a dokumentumszerkezetben (azaz leírják a dokumentumok modelljét)
  * annak megadására, hogy mely elemek opcionálisak, ill. melyek ismétlődhetnek
  * attribútomokhoz alapértelmezett érték rendelésére stb.
* A sémanyelvek **megóvják az alkalmazásokat** a váratlan/értelmezhetetlen formátumoktól, információktól
* A sémanyelvek egyfajta **osztályozása**
  * Szabályalapú nyelvek – pl. Schematron
  * Nyelvtanalapú nyelvek – pl. DTD, RELAX NG
  * Objektumorientált nyelvek – pl. XML Schema
* **Validálás során** vizsgálat:
  * szerkezet: az elemek, attribútumok szerkezete ( markupok szintjén)
  * tartalom: a szöveges csomópontok és attribútumok tartalma
  * integritás: egyediségvizsgálat , hivatkozások épsége
  * üzleti szabályok: pl. nettó ár - ÁFA% - bruttó ár összefüggés, vagy akár olyan bonyolult dolog is, mint a helyesírás-ellenőrzés

#### 2.2.1. XML dialektusok: DTD és XML séma

##### 2.2.1.1. Legfontosabb XML Schema elemek

### 2.3. Információtartalom és feldolgozási stratégiák

* W3C InfoSet -> jól-formázott XML dokumentumok információtartalmának leírására szolgáló absztrakt adathalmaz ->dokumentum rendelkezik InfoSettel, ha:
  * jól-formált,
  * megfelel a névtér-specifikációnak.
  * Azonban az érvényesség nem követelmény!
* Alapvetően információelemekből áll -> XML dokumentum absztrakt leírása
  * Dokumentum információs elem
  * Element
  * Attribute
  * Character
  * Namespace

```
<?xml version="1.0"?>
<msg:message doc:date="19990421"
 xmlns:doc="http://doc.example.org/namespaces/doc"
 xmlns:msg="http://message.example.org/">Phone home!</msg:message>
 ```

#### 2.3.1. Nyelvfüggetlen feldolgozási stratégiák: DOM és SAX

* A Dokumentum Objektum Modell (Document Object Model / DOM) egy platform- és nyelvfüggetlen standard programozói interfész amely a HTML, XHTML, XML valamint rokon formátumaiknak a szerkezetét és az objektumaikkal történő interakciókat modellezi
* A DOM egymással szülő-gyermek kapcsolatban álló objektumok rendszere
* A dokumentum tartalmát, illetve a dokumentum valamennyi összetevőjét magában foglalja és a módosítás eredménye mindig visszahat böngészők esetén a megjelenített oldalra

***A DOM architektúrája***

![DOM architektúra](images/dom.png)

* A DOM legfontosabb jellemzői:
  * a dokumentumot logikailag faként ( Node objektumok hierarchiája) kezeli (szerkezeti modell)
  * objektummodell a klasszikus OO értelemben
    * a dokumentumok (és azok egyes részei) azonossággal, struktúrával, viselkedéssel és kapcsolatokkal is rendelkező objektumok
  * a DOM API kétféle lehetőséget biztosít:
    * egy öröklődési hierarchián alapuló OO megközelítést
    * egy egyszerű (kilapított) nézetet ( „ everything is a Node ” )
  * Alkalmas dokumentumok
    * létrehozására, felépítésére
    * szerkezetének bejárására
    * elemek ill. tartalom hozzáadására, módosítására, törlésére
  * modulokból áll (kékkel a DOM Core , sárgával az XML DOM)

![DOM moduljai](images/dom_modul.png)

* A SAX egy eseményvezérelt értelmező -> 
  * nem hoz létre egy reprezentációs modellt, mint a DOM, melyet aztán tetszőleges módon bejárhatunk, 
  * a dokumentum feldolgozása - mintha csak végig olvasnánk - lineárisan történik
  * dokumentum = adatfolyam -> bizonyos pontokhoz érve különböző események váltódnak ki -> programozó API függvények megfelelő implementálásával reagálhat

![SAX](images/sax.png)

* A DOM-mal szemben nincsenek magának az XML dokumentumnak a reprezentálására szolgáló osztályok, ->  
* az értelmező egy interfészen keresztül szolgáltatja a feldolgozás alatt lévő dokumentumban szereplő adatokat az adott program számára függvényhívások segítségével. Alapvetően négy típussal dolgozik:
  * szöveges csomópontok
  * elem csomópontok
  * feldolgozó utasítások
  * megjegyzések
* Ezért a SAX értelmező
  * rendkívül gyors
  * kiváló megmóriagazdálkodású
* hátránya: használata bonyolultabb tervezést és implementálást igényel -> nincsenek előre elkészített eszközeink
* Nagyméretű XML dokumentumok feldolgozására jó -> jelentős sebességnövekedés

A DOM és a SAX gyors összevetése:
* DOM
  * Fa alapú modell (az adatok csomópontokban vannak)
  * Gyors elérés
  * Lehetőség a csomópontok hozzáadására/törlésére
* SAX
  * Markup elérésekor hívódnak meg a metódusok
  * Nagyobb teljesítmény
  * Kevesebb memória
  * Inkább csak a dokumentum végigolvasására, nem módosítására

### 2.4. A dokumentumtervezés alapjai

1. **Leíró és adat-orientált dokumentum szerkezetek**
   * Leíró dokumentumstruktúra -> XML tartalom már létező szöveg alapú kiegészítése
   * Adat-orientált dokumentumszerkezet -> XML tartalom maga a fontos adat
2. **Építő elemek: attriútumok, elemek és karakter adatok**
   * dizájn, olvashatóság, értelmezhetőség
3. **Buktatók**

#### 2.4.1. Leíró- és adat-orientált dokumentum struktúrák

- leíró dokumentumstruktúra: XML tartalmat már létező, szöveg alapú adat kiegészítésére (hasonlóan HTML címkék weboladalakhoz)
- Adat-orientált dokumentumszerkezet: XML tartalom maga a fontos adat (XML jelölő a fontos adat -> XML jelölők jól struktúrált adatok leírására)

***Adat-orientált dokumentumok***

- Általában alkalmazások számára
- A dokumentumokban szereplő adatok segítségével elképzelhetjük, hogy az adatnak egy az egyhez leképezése van az alkalmazásunk jellemzőivel, az XML dokumentumot ezzel az objektumaink szerializált verziójává alakítva. Ez a szerializáció nagyon gyakori az XML-nél, ilyenkor legtöbbször adat-orientált megközelítést használunk.
- .NETnél (18.old)
- JAVA XML csomagban -> JAVA API for XML Binding (JAXB) -> XML dokumentumok Java osztállyá történő oda-vissza leképezése
- Java Bean-ek is XML-re képezhetők
- XML -> folyamatok leírására Apache Ant
- adat-orientált dokumentumok a legjobb választás bármilyen fajta jól struktúrált adat ábrázolására.

***Leíró dokumentumok***

- felhasználói fogyasztásra tervezve -> emberek által olvasható szövegek XML jelölővel bővítve
- a tartalmat nem a jelölő határozza meg
- a jelölő adat nagyon struktúrálatlan
- HTML weboldalak
- **Megjelenítés:** XHTML -> XML jelölő alkalmazása leíró stílusú dokumentumhoz a megjelenés szabályozására
- **Indexelés:** alkalmazások -> hatékony kiemelés XML jelölőt használva -> majd indexelik a dokumentumot (relációs adatbázist vagy teljes szöveges indexelő szoftvert használva)
- **Annotációk:** alkalmazás XML-lel fűzhet annotációt már létező dokumentumokhoz

### 4.2. Építőelemek: attribútumok, elemek és karakteradatok

***Leíró jellegű dokumentumokban***
- 

## XML adatbázisok

## XDM: az XPath és XQuery adatmodellje

## XPath

## XQuery