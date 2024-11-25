# Jeszenszky Péter - XML sémanyelvek [^1]

![1](images/1.png)

## Tartalomjegyzék

1. [Jeszenszky Péter - XML sémanyelvek \[^1\]](#jeszenszky-péter---xml-sémanyelvek-1)
   1. [Tartalomjegyzék](#tartalomjegyzék)
   2. [I. W3C XML Schema](#i-w3c-xml-schema)
      1. [1. Alapfogalmak](#1-alapfogalmak)
         1. [Bevezetés](#bevezetés)
         2. [Sémák és démadokumentumok](#sémák-és-démadokumentumok)
            1. [Sémakomponensek](#sémakomponensek)
            2. [Sémák ábrázolása sémadokumentumokban](#sémák-ábrázolása-sémadokumentumokban)
         3. [Deklarációk és definíciók](#deklarációk-és-definíciók)
         4. [Típusrendszer](#típusrendszer)
            1. [Típusdefiníciók](#típusdefiníciók)
            2. [Egyszerű és komplex típusok](#egyszerű-és-komplex-típusok)
            3. [Típushierarchia](#típushierarchia)
      2. [2. Egyszerű típusok (adattípusok) fogalmai](#2-egyszerű-típusok-adattípusok-fogalmai)
         1. [Bevezetés](#bevezetés-1)
         2. [Adattípusok fajtái](#adattípusok-fajtái)
            1. [Primitív és származtatott adattípusok](#primitív-és-származtatott-adattípusok)
            2. [Beépített és felhasználói származtatott adattípusok](#beépített-és-felhasználói-származtatott-adattípusok)
            3. [Atomi, lista és unió adattípusok](#atomi-lista-és-unió-adattípusok)
         3. [Adattípus fogalma](#adattípus-fogalma)
            1. [Értéktér](#értéktér)
            2. [Lexikális tér](#lexikális-tér)
            3. [Adattípus-tulajdonságok](#adattípus-tulajdonságok)
         4. [Adattípus-alaptulajdonságok](#adattípus-alaptulajdonságok)
            1. [bounded](#bounded)
            2. [cardinality](#cardinality)
            3. [numeric](#numeric)
            4. [ordered](#ordered)
         5. [Lista adattípusok](#lista-adattípusok)
         6. [Unió adattípusok](#unió-adattípusok)
         7. [Példa: a decimal adattípus](#példa-a-decimal-adattípus)
      3. [3. Elemek és tulajdonságok deklarálása](#3-elemek-és-tulajdonságok-deklarálása)
         1. [Bevezetés](#bevezetés-2)
         2. [Elemek deklarálása](#elemek-deklarálása)
            1. [Előfordulások száma](#előfordulások-száma)
            2. [Alapértelmezett érték](#alapértelmezett-érték)
            3. [Rögzített érték](#rögzített-érték)
            4. [Helyettesítési csoportok](#helyettesítési-csoportok)
            5. [Absztrakt elemek](#absztrakt-elemek)
         3. [Tulajdonságok deklarálása](#tulajdonságok-deklarálása)
            1. [Előfordulás](#előfordulás)
            2. [Alapértelmezett érték](#alapértelmezett-érték-1)
            3. [Rögzített érték](#rögzített-érték-1)
         4. [Tulajdonságcsoport definíciók](#tulajdonságcsoport-definíciók)
      4. [4. Egyszerű típusok (adattípusok) használata és származtatása](#4-egyszerű-típusok-adattípusok-használata-és-származtatása)
      5. [5. Komplex típusok](#5-komplex-típusok)
      6. [6. Azonossági megszorítások](#6-azonossági-megszorítások)
      7. [7. Névterek](#7-névterek)
      8. [8. Példányok](#8-példányok)
      9. [9. További lehetőségek](#9-további-lehetőségek)
      10. [10. Esettanulmány](#10-esettanulmány)
   3. [A. Beépített adattípusok](#a-beépített-adattípusok)
   4. [B. Korlátozó adattípus-tulajdonságok](#b-korlátozó-adattípus-tulajdonságok)
   5. [C. Dokumentumok az Esettanulmány című fejezethez](#c-dokumentumok-az-esettanulmány-című-fejezethez)
   6. [D. Sémadokumentumok manipulálása](#d-sémadokumentumok-manipulálása)
   7. [Könyv elérhetősége](#könyv-elérhetősége)

## I. W3C XML Schema

***W3C***
* [XML Schema: Primer](https://www.w3.org/TR/xmlschema-0/)
  * Bevezető példákon keresztül
* [XML Schema: Structures](https://www.w3.org/TR/xmlschema-1/)
  * Sémanyelv részletes tárgyalása
* [XML Schema: Datatypes](https://www.w3.org/TR/xmlschema-2/)
  * Adattípusok külön tárgyalása - szabvány többi részétől függetlenül is használható
* továbbá még [XML Names](https://www.w3.org/TR/xml-names/) -> névterek

***Sémanyelv legfontosabb jellemzői***
* XML szintaxis használata
* Önleíró (létezik a sémákhoz séma)
* Primitív adattípusok biztosítása
* Felhasználói típusok létrehozását támogató típusrendszer
* XML névterek támogatása
* Alkalmazások széles köre által használható

***Hátrányai***
* Nehezen érthetőség
* Bonyolult, kényelmetlen szintaxis

### 1. Alapfogalmak

#### Bevezetés

Alapfogalmak + jelentésük

#### Sémák és démadokumentumok

* A sémák sémakomponensekből álló objektumok
* XML formátum a sémák ábrázolásához -> sémák XML reprezentációi: sémadokumentumok

##### Sémakomponensek

1. Elsődleges sémakomponensek
  1. elemdeklarációk
  2. tulajdonság-deklarációk
  3. típusdefiníciók
2. Másodlagos sémakomponensek
  1. modellcsoport-definíciók
  2. tulajdonságcsoport definíciók
  3. azonossági megszorítások definíciói
  4. jelölésdeklarációk
3. Segédkomponensek
  1. kommentárok
  2. modellcsoportok
  3. részecskék
  4. helyettesítők

* Minden komponenst egy elem ábrázol a sémadokumentumban.
* Deklarációknak és definícióknak lehet azonosítóként szolgáló neve -> hivatkozható
* Elsődleges - deklarációk -> kötelező név, típusdefiníciókhoz -> opcionális
* Másodlagos -> mindenhol kötelező név
* Segédkomp -> név sehol
* Sémakomp név: kekttőspont karaktert nem tartalmazó érvényes XML név -> `name` tulajdonság értékeként
* Cél-névtér -> opcionális, megadásakor sémakomponensek nevei ezzel meghatározott névtérbe tartoznak (ha nincs nem tartoznak névtérbe)

##### Sémák ábrázolása sémadokumentumokban

* Sémakomponenseket ábrázoló XML elemek nevei -> alábbi névtérbe

```
http://www.w3.org/2001/SMLSchema
```

* `schema` nevű elem -> gyökér
* `xs` vagy `xsd` előtaggal névtérhez kötés

```
<?xml version="1.0"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/SMLSchema" targetNamespace="URI">
    sémakomponens(ek)
</xs:schema>
```

* `targetNamespace` opcionális -> gyerekként tartalmazhat:
  * minden elsődleges sémakomponenst
  * másodlagosból: modellcsoport-def, tulajdonságcsoport-def, jelölésdekl
  * segédkompból: kommentárok

#### Deklarációk és definíciók

* Deklarációk
  * Érvényesítés során megfeleltethetők a dokumentumok azon alkotórészeinek, amelyeken érvényesítést kell végezni
  * Megfeleltetés név alapján
  * Elem és tulajdonságdekl -> 
    * típusdefiníciót rendel hozzá egy névhez
    * dokumentumok érvényesítésére, feldolgozására vonatkozó további infók (pl alapértelmezett értékek)
* Definíciók
  * Más sémakomponensek használhatják fel

#### Típusrendszer

* Elemekhez és tulajdonságokhoz kötődnek
* Minden deklarált elemhez és tulajdonsághoz egy típusdef

##### Típusdefiníciók

* Minden típust egy típusdef határoz meg -> típusdefiníciós sémakomponens ábrázol
* Lehet neve (nem kötelező)
* Névtelen típusok egy helyen használhatók

##### Egyszerű és komplex típusok

* Típusdefiníciókkal elemekre és tulajdonságokra vonatkozó érvényességi megszorítások

***Egyszerű típusok***
* Egy olyan értékhalmaz, amelynek elemeit szövegel literálok ábrázolják
* Beépített egyszerű típusok -> programozási nyelvek és adatbáziskezelő rendszerek adattípusai
  * boolean
  * date
  * double
  * int
  * stb.
* Elemek és tulajdonságok típusa, de nem lehetnek tulajdonságaik

***Komplex típusok***
* Kizárólag elemekhez
* Tartalomként elemek és tulajdonságok
* Nincsenek beépített komplex típusok

##### Típushierarchia

![Típushierarchia](images/typehierarchy.png)

* Komplex típus-definíciók a hierarchiában
  * egy egyszerű típus-definíciók kiterjesztése
  * egy másik komplex típus-definíció kiterjesztése
  * egy másik komplex típus-definíció megszorítása
* Egyszerű típus-definíciók a hierarchiában
  * egy másik egyszerű típus-definíció megszorítása
  * egy másik egyszerű típus-definíció felhasználásával listaképzéssel származtatott
  * más egyszerű típus-definíciók felhasználásával unióképzéssel származtatott

### 2. Egyszerű típusok (adattípusok) fogalmai

#### Bevezetés

#### Adattípusok fajtái

##### Primitív és származtatott adattípusok

* Primitív adattípusok -> definiálásukhoz nem kell más adattípus pl
  * boolean
  * double
  * string
  * decimal
* Származtatott adattípusok -> definiálásuk más adattípus felhasználásával (megszorítással, lista vagy unióképzéssel) pl
  * integer
  * normalizedString

##### Beépített és felhasználói származtatott adattípusok

* Beépített adattípusok -> az [XML Schema: Datatypes](https://www.w3.org/TR/xmlschema-2/) specifikál pl
  * boolean
  * integer
  * time

##### Atomi, lista és unió adattípusok

* Atomi
  * Értékei oszthatatlanok pl. double, string
* Lista
  * atomi adattípus értékeiből álló véges sorozatok
    * IDREF
    * ENTITIES
    * NMTOKENS
* Unió
  * más tagtípus adattípus értékhalmazainak uniója

#### Adattípus fogalma

***Adattípust meghatározza***
* Értéktér -> értékek halmaza
* Lexikális tér -> értékeket ábrázoló literálok halmaza
* Értékteret, egyedi értékeket, vagy literálokat jellemző adattípus tulajdonságok

##### Értéktér

* Adattípus értékek halmaza -> meghatározható:
  * axiomatikusan (primitív adattípusok)
  * értéktér elemei felsorolásával
  * másik adattípus értékterének korlátozásával
  * egy vagy több adattípus értékteréből származó értékek kombinálásával

##### Lexikális tér

* Adattípus értékeit reprezentáló karaterláncok (literálok) halmaza
* Kanonikus lexikális reprezentáció:
  * lexikális tér részhalmaza
  * kölcsönösen egyértelműen feleltethető meg az értéktér elemeinek

##### Adattípus-tulajdonságok

* Adattípusokat meghatározó tulajdonságok
* meghatározzák az adattípus értékterét és jellemzőit

***Adattípus-alaptulajdonságok***
* absztrakt tulajdonságok
* szemantikusan jellemzik az értékteret

***Korlátozó adattípus-tulajdonságok***
* típusdefiníciók megszorítással
* értéktér korlátozása -> lexikális tér korlátozása is -> [Korlátozó adattípus-tulajdonságok](#b-korlátozó-adattípus-tulajdonságok)

#### Adattípus-alaptulajdonságok

* Értéktér absztrakt (matematikai) jellemzői
* sémában rögzíti minden beépített adattípusra minden adattípus tulajdonság értékét
* új adattípus származtatása során adattípus-alaptulajdonságok meghatározása

##### bounded

* logikai értékű -> adattípus korlátos-e
  * true -> korlátos
    * létezik olyan érték, amely értéktér minden értékénél
      * kisebb vagy egyenlő vagy szigorúan kisebb
      * nagyobb vagy egyenlő vagy szigorúan nagyobb
    * atomi származtatott adattípus esetén, ha alaptípus-tulajdonságai között van:
      * minInclusive
      * minExclusive
      * maxInclusive
      * maxExclusive
    * lista adattípus esetén, ha alaptípus-tulajdonságai között van:
      * length
      * minLength
      * maxLength
    * unió adattípusnál:
      * true minden tagtípusnál
      * van anySimpleType-tól különböző adattípus, mely őse minden adattípusnak
    * beépített adattípusok közül:
      * double
      * float
      * long
  * false -> nem
    * beépített adattípusok közül:
      * date
      * positiveInteger

##### cardinality

* Adattípus értékterének számosságát jelző adattípus-alaptulajdonság -> adattípus számossága
  * finite (véges)
  * countably infinite (megszámlálhatóan végtelen)

##### numeric

* Azok az adattípusok, amelyek értékterének elemei számok
  * true -> numerikus
  * false -> nem

##### ordered

* Rendezést értelmez az értéktér elemei között -> rendezett adattípusok
  * szigorú részbenrendezés: szigorúan kisebb, szigorúan nagyobb értékek, nem feltétlenül összehasonlítható bármely két elem
  * szigorú teljes rendezés -> részbenrendezés, ahol bármely két elem összehasonlítható
* Lehetséges értékek:
  * false -> értéktéren nem értelmezett rendezés
  * partial -> szigorú részbenrendezés
  * total -> szigorú teljes rendezés

#### Lista adattípusok

* Értékterét elemtípus nevű adattípus értékeiből álló véges sorozatok
* Lexikális tere: elemtípus literáljaiból álló listák, amelyekben az elemeket szóköz karakterek választják el

#### Unió adattípusok

* Értéktere tagtípusoknak nevezett adattípusok értéktereinek uniója
* tagtípus lehet:
  * atomi
  * lista
  * unió

#### Példa: a decimal adattípus

* Atomi beépített primitív adattípus

### 3. Elemek és tulajdonságok deklarálása

#### Bevezetés

#### Elemek deklarálása

* Egy névhez rendelnek:
  * egyszerű vagy komplex típusdefiníciót
  * opcionálisan további dokumentum érvényesítését és feldolgozását befolyásoló információkat (pl. alpértelmezett vagy rögzített érték)
* `element` elem használata:
  * felső szinten, közvetlenül a `schema` elem gyermekeként -> globális elemdeklarációk
    * neveinek egyinek kell lenni a sémában
    * csak ezek fordulhatnak elő a példányokban gyökérelemként
    * hivatkozni lehet rájuk
    * `name` kötelező
    * `type` -> típusdef adható meg (egyszerű vagy komplex), vagy
    * `element` elem gyermekeként megadható egy névtelen típusdefiníció
  * modellcsoportokban -> komplex típus-definíciók és modellcsoport-definíciók részeként
    * lokális elemdeklarációk ->
      * nem kell egyedi név
      * `name` kötelező
      * `type` -> típusdef adható meg (egyszerű vagy komplex), vagy
    * `element` elem gyermekeként megadható egy névtelen típusdefiníció
    * globális elemdeklarációkra történő hivatkozások -> 

```
<xs:element name="név" type="típus"/>

<xs:element name="név"> típusdefiníció </xs:element>
```

***Globális elemdeklarációkra történő hivatkozás***

```
<xs:element name="message">
    <xs:complexType>
        <xs:sequence>
            <xs:element ref="header" />
            <xs:element ref="body" />
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

***`element` elem tulajdonságai és előfordulásuk***

| Tulajdonság | Globális elemdeklaráció | Lokális elemdeklaráció | Hivatkozás globális elemdeklarációra |
| --- | --- | --- | --- |
| default | X | X | |
| fixed | X | X | |
| minOccurs/ maxOccurs | | X | X |
| name | X | X | |
| nillable | X | X | |
| ref | | | X |
| substitutionGroup | X | | |
| type | X | X | |

##### Előfordulások száma

* modellcsoportokban előforduló `element` elemekhez adható meg
* `minOccurs` -> előfordulás minimális száma, 
  * nemnegatív egész
  * alapértelmezett érték: 1
* `maxOccurs` -> előfordulás maximális száma
  * nemnegatív egész
  * `unbounded`
  * alapértelmezett: 1
  * `minOccurs` értékénél kisebb nem lehet

##### Alapértelmezett érték

* DTD deklarációkban, XML Schema elemekhez is
* Globális és lokális elemdeklarációként előforuló `element` elemekhez adható meg a `default` tulajdonság
* Egyszerű vagy vegyes tartalmú elemeknél, amelyek megengedik csak szöveg előfordulását

##### Rögzített érték

* DTD tulajdonságlista deklarációkban, XML Schema elemekhez is
* Globális és lokális elemdeklarációknál `element` elemhez `fixed` tulajdonság -> kizárólag a rögzített érték megengedett
* Egyszerű típusú, vagy vegyes tartalmú elemekhez használható, amelyek megengedik csak szöveg előfordulását

##### Helyettesítési csoportok

* Helyettesítési csoport mechanizmus -> lehetővé teszi a példányokba adott globális elem más globális elemekkel történő helyettesítését
* Globális deklarációban adatt `element` elemekhez `substitutionGroup` tulajdonság
* Értékeként globális elemdeklaráció nevét kell megadni

```
<xs:element name="familyName" type="xs:string" />

<xs:element name="surname" type="xs:string" substitutionGroup="familyName" />

<xs:element name="lastName" type="xs:string" substitutionGroup="familyName" />
```

* Nem megengedett a körkörös helyettesíthetőség -> elemek nem helyettesíthetők egymással (pl egy "citizenship" nevű "nationalityval" ha egyszerre akarjuk helyettesíteni mindkettőt a másikkal)

```
<xs:element name="citizenship" type="xs:string" substitutionGroup="nationality" />

<xs:element name="nationality" type="xs:string" substitutionGroup="citizenship" />
```

##### Absztrakt elemek

* Globális elemdeklarációnál `element` elemhez `abstract` tulajdonság
* Alapértelmezett értéke: `false`
* Absztrakt az elem, ha értéke `true`
* Nem fordulhatnak elő példányokban -> helyettesítési csoportot használunk hozzá, tagjai helyettesíthetik az absztrakt elemet.

```
<schema xmlns="http://www.w3.org/2001/XMLSchema"
           targetNamespace="http://cars.example.com/schema"
           xmlns:target="http://cars.example.com/schema">

  <complexType name="Vehicle" abstract="true"/>

  <complexType name="Car">
    <complexContent>
      <extension base="target:Vehicle"/>
    </complexContent>
  </complexType>

  <complexType name="Plane">
    <complexContent>
      <extension base="target:Vehicle"/>
    </complexContent>
  </complexType>

  <element name="transport" type="target:Vehicle"/>
</schema>
```

#### Tulajdonságok deklarálása

* Egy névhez egy egyszerű típusdefiníciót rendelnek hozzá
* Opcionális további, dokumentum érvényesítést és feldolgozást befolyásoló információkat
* Deklarációk és a tulajdonságok egymásnak való megfeleltetése a nevük alapján történik
* `attribute` elemmel
  * Szerepelhet felső szinten, schema gyermekeként -> globális
    * kötelező `name` tulajdonság
    * `type` tulajdonság értékeként egyszerű típusdef adható meg
    * `attribute` elem gyermekeként megadható egy névtelen egyszerű típusdefiníció
  * Komplex típus-definíciók és tulajdonságcsoport-definíciók részeként -> 
    * lokális tulajdonságdeklarációk
      * kötelező `name` tulajdonság
      * `type` tulajdonság értékeként egyszerű típusdef adható meg
      * `attribute` elem gyermekeként megadható egy névtelen egyszerű típusdefiníció
    * globális tulajdonság-deklarációkra történő hivatkozások

```
<xs:attribute name="név" type="típus"/>

<xs:attribute name="név">egyszerű típus-definíció </xs:element>
```

* Globális tulajdonságdeklarációk nevei egyediek kell legyenek
* Lokálisnál nem kell egyedi név

| Tulajdonság | Globális tulajdonság-deklaráció | Lokális tulajdonság-deklaráció | Hivatkozás globális tulajdonság-deklarációra |
| --- | --- | --- | --- |
| default | X | X | X |
| fixed | X | X | X |
| name | X | X | |
| ref | | | X |
| type | X | X | |
| use | | X | X |

##### Előfordulás

* Lokális tulajdonság-deklarációként és globális tulajdonság-deklarációra hivatkozásként `attribute` elemhez -> `use`
  * `optional` -> tulajdonság nem kötelező, alapért
  * `required` -> tulajdonság kötelező
  * `prohibited` -> tulajdonság tiltott (komplex típusok megszorítással történő származtatásához)

##### Alapértelmezett érték

* Olyan `attribute` elemekhez a `default` tulajdonság, melyeknél `use` értéke `optional`
* lenti példában a boolean típusú `enabled` tulajdonság alapértelmezett értéke `false`

```
<xs:attribute name="enabled" type="xs:boolean" default="false" />
```

##### Rögzített érték

* `attribute` elem minden előfordulásánál megjelenhet `fixed` tulajdonság -> tulajdonság rögzített értéke, példányokban csak ez megengedett
* példában `units` tulajdonság rögzített érteke a "cm" karakterlánc

```
<xs:attribute name="units" type="xs:token" fixed="cm" />
```

#### Tulajdonságcsoport definíciók

* Másodlagos sémakomponensek, amelyek tulajdonság-deklarációk egy csoportjának elnevezését teszik lehetővé többszöri felhasználás céljából

### 4. Egyszerű típusok (adattípusok) használata és származtatása

### 5. Komplex típusok

### 6. Azonossági megszorítások

### 7. Névterek

### 8. Példányok

### 9. További lehetőségek

### 10. Esettanulmány

## A. Beépített adattípusok

## B. Korlátozó adattípus-tulajdonságok

## C. Dokumentumok az Esettanulmány című fejezethez

## D. Sémadokumentumok manipulálása

[Tartalomjegyzék](#tartalomjegyzék)

---
[^1]: Jeszenszky Péter: XML sémanyelvek, 2010.
[Könyv elérhetősége](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#d6e30)
---
