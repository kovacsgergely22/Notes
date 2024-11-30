# Jeszenszky Péter - XML sémanyelvek [^1]

![1](images/1.png)

## Tartalomjegyzék

1. [Jeszenszky Péter - XML sémanyelvek \[^1\]](#jeszenszky-péter---xml-sémanyelvek-1)
   1. [Tartalomjegyzék](#tartalomjegyzék)
   2. [I. W3C XML Schema](#i-w3c-xml-schema)
         1. [Bevezetés](#bevezetés)
      1. [1. Alapfogalmak](#1-alapfogalmak)
         1. [Sémák és démadokumentumok](#sémák-és-démadokumentumok)
            1. [Sémakomponensek](#sémakomponensek)
      2. [3. Elemek és tulajdonságok deklarálása](#3-elemek-és-tulajdonságok-deklarálása)
         1. [Bevezetés](#bevezetés-1)
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
      3. [4. Egyszerű típusok (adattípusok) használata és származtatása](#4-egyszerű-típusok-adattípusok-használata-és-származtatása)
         1. [Bevezetés](#bevezetés-2)
         2. [Beépített adattípusok](#beépített-adattípusok)
         3. [Literálok használata példányokban](#literálok-használata-példányokban)
            1. [Whitespace karakterek kezelése](#whitespace-karakterek-kezelése)
         4. [Adattípusok definiálása](#adattípusok-definiálása)
         5. [Adattípusok származtatása megszorítással](#adattípusok-származtatása-megszorítással)
         6. [Adattípusok származtatása listaképzéssel](#adattípusok-származtatása-listaképzéssel)
         7. [Adattípusok származtatása unióképzéssel](#adattípusok-származtatása-unióképzéssel)
         8. [Származtatás korlátozása](#származtatás-korlátozása)
         9. [Az anySimpleType adattípus](#az-anysimpletype-adattípus)
      4. [5. Komplex típusok](#5-komplex-típusok)
         1. [Komplex típusok definiálása](#komplex-típusok-definiálása)
         2. [Csak elmeket tartalmazó elemek](#csak-elmeket-tartalmazó-elemek)
            1. [Tartalommodellek](#tartalommodellek)
            2. [Modellcsoportok](#modellcsoportok)
            3. [Modellcsoportokra vonatkozó korlátozások](#modellcsoportokra-vonatkozó-korlátozások)
            4. [Modellcsoport-definícók](#modellcsoport-definícók)
         3. [Vegyes tartalmú elemek](#vegyes-tartalmú-elemek)
         4. [Tulajdonságok használata](#tulajdonságok-használata)
            1. [Szövegtartalmú elemek tulajdonságokkal](#szövegtartalmú-elemek-tulajdonságokkal)
         5. [Üreselemek](#üreselemek)
         6. [Komplex típusok megszorítása és kiterjesztése](#komplex-típusok-megszorítása-és-kiterjesztése)
            1. [Komplex típus definíciójának kiterjesztése](#komplex-típus-definíciójának-kiterjesztése)
            2. [Komplex típus definíciójának megszorítása](#komplex-típus-definíciójának-megszorítása)
            3. [Származtatás korlátozása](#származtatás-korlátozása-1)
         7. [Polimorfizmus](#polimorfizmus)
         8. [Absztrakt típusok](#absztrakt-típusok)
         9. [Az anyType típus](#az-anytype-típus)
         10. [Helyettesítők](#helyettesítők)
      5. [6. Azonossági megszorítások](#6-azonossági-megszorítások)
         1. [Bevezetés](#bevezetés-3)
         2. [Azonossági megszorítások definiálása](#azonossági-megszorítások-definiálása)
            1. [XPath elérési útvonalak](#xpath-elérési-útvonalak)
         3. [Szematika](#szematika)
            1. [`key`](#key)
            2. [`keyref`](#keyref)
            3. [`unique`](#unique)
      6. [7. Névterek](#7-névterek)
      7. [8. Példányok](#8-példányok)
      8. [9. További lehetőségek](#9-további-lehetőségek)
      9. [10. Esettanulmány](#10-esettanulmány)
   3. [A. Beépített adattípusok](#a-beépített-adattípusok)
   4. [B. Korlátozó adattípus-tulajdonságok](#b-korlátozó-adattípus-tulajdonságok)
   5. [C. Dokumentumok az Esettanulmány című fejezethez](#c-dokumentumok-az-esettanulmány-című-fejezethez)
   6. [D. Sémadokumentumok manipulálása](#d-sémadokumentumok-manipulálása)
   7. [Könyv elérhetősége](#könyv-elérhetősége)


## I. W3C XML Schema

#### Bevezetés

### 1. Alapfogalmak

#### Sémák és démadokumentumok

##### Sémakomponensek

***Sémadokumentumok alakja általánosan***

```
<?xml version="1.0"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/SMLSchema" targetNamespace="URI">
    sémakomponens(ek)
</xs:schema>
```

### 3. Elemek és tulajdonságok deklarálása

#### Bevezetés

#### Elemek deklarálása 

```
<xs:element name="név" type="típus"/>

<xs:element name="név"> típusdefiníció </xs:element>
```

***Globális és lokális elemdeklarációk***

```
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">

    <xs:element name="athlete">
        <xs:complexType>
            <xs:sequence>
                <xs:element name="name" type="xs:string"/>
                <xs:element name="dateOfBirth" type="xs:date"/>
                <xs:element name="gender">
                    <xs:simpleType>
                        <xs:restriction base="xs:string">
                            <xs:enumeration value="female"/>
                            <xs:enumeration value="male"/>
                        </xs:restriction>
                    </xs:simpleType>
                </xs:element>
            </xs:sequence>
        </xs:complexType>
    </xs:element>
    ...

</xs:schema>
```

* Globális elem: `athlete`
* Lokális elemek: `name`, `dateOfBirth` és `gender`
* Az `athlete` elem egy lehetséges előfordulása:

```
<athlete>
    <name>Usain Bolt</name>
    <dateOfBirth>1986-08-21</dateOfBirth>
    <gender>male</gender>
</athlete>
```

* Globális elemdeklarációkra hivatkozni lehet komplex típus-definíciók és modellcsoport-definíciók részeként előforduló modellcsoportokban. A hivatkozást egy olyan `element` elem ábrázolja, amely `ref` tulajdonságának értéke egy globális elemdeklaráció neve:

```
<xs:element ref="név"/>
```

* Az `element` elem fenti előfordulása a `ref` tulajdonság révén hivatkozott elemdeklaráció felhasználását jelenti.

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

* A `message` elemhez tartozó típusdefinícióban hivatkozott `header` és `body` elemdeklarációk globálisak kell, hogy legyenek.

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

```
<xs:element name="keywords">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="keyword" type="xs:string" minOccurs="1" maxOccurs="10"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

##### Alapértelmezett érték

```
<xs:element name="numberOfChildren" type="xs:nonNegativeInteger" default="0"/>
```

##### Rögzített érték

```
<xs:element name="content-type" type="xs:string" fixed="text/html"/>
```

##### Helyettesítési csoportok

```
<xs:element name="familyName" type="xs:string" />

<xs:element name="surname" type="xs:string" substitutionGroup="familyName" />

<xs:element name="lastName" type="xs:string" substitutionGroup="familyName" />
```

* **Nem megengedett** a körkörös helyettesíthetőség -> elemek nem helyettesíthetők egymással (pl egy "citizenship" nevű "nationalityval" ha egyszerre akarjuk helyettesíteni mindkettőt a másikkal)

```
<xs:element name="citizenship" type="xs:string" substitutionGroup="nationality" />

<xs:element name="nationality" type="xs:string" substitutionGroup="citizenship" />
```

##### Absztrakt elemek

```
<xs:element name="uri" type="xs:anyURI" abstract="true"/>

<xs:element name="http-uri" substitutionGroup="uri">
    <xs:simpleType>
        <xs:restriction base="xs:anyURI">
            <xs:pattern value="http://.*"/>
        </xs:restriction>
    </xs:simpleType>
</xs:element>

<xs:element name="ftp-uri" substitutionGroup="uri">
    <xs:simpleType>
        <xs:restriction base="xs:anyURI">
            <xs:pattern value="ftp://.*"/>
        </xs:restriction>
    </xs:simpleType>
</xs:element>
```

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

```
<xs:attribute name="név" type="típus"/>

<xs:attribute name="név">egyszerű típus-definíció </xs:element>
```

***Lokális tulajdonságdeklarációk***

```
<xs:element name="size">
    <xs:complexType>
        <xs:attribute name="width" type="xs:nonNegativeInteger" use="required"/>
        <xs:attribute name="height" type="xs:nonNegativeInteger" use="required"/>
    </xs:complexType>
</xs:element>
```

***Globális tulajdonságdeklarációra történő hivatkozás***

```
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">

    <xs:attribute name="priority">
        <xs:simpleType>
            <xs:restriction base="xs:token">
                <xs:enumeration value="low"/>
                <xs:enumeration value="normal"/>
                <xs:enumeration value="high"/>
            </xs:restriction>
        </xs:simpleType>
    </xs:attribute>

    <xs:element name="message">
        <xs:complexType>
            <xs:simpleContent>
                <xs:extension base="xs:string">
                    <xs:attribute ref="priority" default="normal"/>
                </xs:extension>
            </xs:simpleContent>
        </xs:complexType>
    </xs:element>
    ...

</xs:schema>
```

***`attribute` elem tulajdonságai

| Tulajdonság | Globális tulajdonság-deklaráció | Lokális tulajdonság-deklaráció | Hivatkozás globális tulajdonság-deklarációra |
| --- | --- | --- | --- |
| default | X | X | X |
| fixed | X | X | X |
| name | X | X | |
| ref | | | X |
| type | X | X | |
| use | | X | X |

##### Előfordulás

##### Alapértelmezett érték

```
<xs:attribute name="enabled" type="xs:boolean" default="false" />
```

##### Rögzített érték

```
<xs:attribute name="units" type="xs:token" fixed="cm" />
```

#### Tulajdonságcsoport definíciók

```
<xs:attributeGroup name="név">
    tulajdonságok használatára vonatkozó elemek
</xs:attributeGroup>
```

```
<xs:attributeGroup ref="név"/>
```

***Tulajdonságcsoport-definíció*** -> két lokális tulajdonság-deklarációval

```
<xs:attributeGroup name="alignAtts">
    <xs:attribute name="halign">
        <xs:simpleType>
            <xs:restriction base="xs:token">
                <xs:enumeration value="left"/>
                <xs:enumeration value="center"/>
                <xs:enumeration value="right"/>
            </xs:restriction>
        </xs:simpleType>
    </xs:attribute>
    <xs:attribute name="valign">
        <xs:simpleType>
            <xs:restriction base="xs:token">
                <xs:enumeration value="top"/>
                <xs:enumeration value="middle"/>
                <xs:enumeration value="bottom"/>
            </xs:restriction>
        </xs:simpleType>
    </xs:attribute>
</xs:attributeGroup>
```

***Felhasználás komplex típus-definícióban***

```
<xs:element name="column">
    <xs:complexType>
        <xs:attribute name="title" type="xs:string"/>
        <xs:attributeGroup ref="alignAtts"/>
    </xs:complexType>
</xs:element>
```

***`column` lehetséges előfordulása***

```
<column title="name" halign="center" valign="top"/>
```

### 4. Egyszerű típusok (adattípusok) használata és származtatása

#### Bevezetés

#### Beépített adattípusok

[Beépített adattípusok](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#builtin-datatypes)

#### Literálok használata példányokban

##### Whitespace karakterek kezelése

#### Adattípusok definiálása

```
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">

    <xs:simpleType name="grade">
        <xs:restriction base="xs:integer">
            <xs:minInclusive value="1"/>
            <xs:maxInclusive value="5"/>
        </xs:restriction>
    </xs:simpleType>

    <xs:element name="grade" type="grade"/>
    ...
</xs:schema>
```

***Névtelen adattípus definíciója és felhasználása:***

```
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">

    <xs:attribute name="currency">
        <xs:simpleType>
            <xs:restriction base="xs:token">
                <xs:enumeration value="EUR"/>
                <xs:enumeration value="HUF"/>
            </xs:restriction>
        </xs:simpleType>
    </xs:attribute>
    ...
</xs:schema>
```

#### Adattípusok származtatása megszorítással

* **Alap típusdefinícióból megszorítással**
[Korlátozó adattípus-tulajdonságok](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#d6e1260)

```
<xs:simpleType name="név">
    <xs:restriction base="alaptípus">  (felső szintű típusdefiníció használata)
        korlátozó adattípus-tulajdonságok értékeit meghatározó elemek
    </xs:restriction>
</xs:simpleType>
```

```
<xs:simpleType name="név">
    <xs:restriction>
        <xs:simpleType>  (névtelen típusdefiníció használata)
            ...
        </xs:simpleType>
        korlátozó adattípus-tulajdonságok értékeit meghatározó elemek
    </xs:restriction>
</xs:simpleType>
```

***Példák:***

* [`integer`](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#datatypes-derived-from-decimal) adattípusra

```
<xs:simpleType name="percent">
    <xs:restriction base="xs:integer">
        <xs:minInclusive value="1"/>
        <xs:maxInclusive value="100"/>
    </xs:restriction>
</xs:simpleType>
```

* [`decimal`](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#decimal-datatype) adattípusra

```
<xs:simpleType name="price">
    <xs:restriction base="xs:decimal">
        <xs:minInclusive value="0"/>
        <xs:fractionDigits value="2"/>
    </xs:restriction>
</xs:simpleType>
```

* [`pattern`](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#pattern-facet) adattípus tulajdonságok [`string`](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#string-datatype) adattípusra

```
<xs:simpleType name="isbn13">
    <xs:restriction base="xs:string">
        <xs:pattern value="[0-9]{13}"/>
    </xs:restriction>
</xs:simpleType>
```

* [`pattern`](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#pattern-facet) adattípus tulajdonságok [`anyURI`](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#anyURI-datatype) típusra

```
<xs:simpleType name="myURI">
    <xs:restriction base="xs:anyURI">
        <xs:pattern value="ftp://.*"/>
        <xs:pattern value="http(s)?://.*"/>
    </xs:restriction>
</xs:simpleType>
```

***Egyenlő ezzel:***

```
<xs:simpleType name="myURI">
    <xs:restriction base="xs:anyURI">
        <xs:pattern value="(ftp://.*)|(http(s)?://.*)"/>
    </xs:restriction>
</xs:simpleType>
```

***Adattípus tulajdonságok öröklése***

```
<xs:simpleType name="T0">
    <xs:restriction base="xs:decimal">
        <xs:minInclusive value="0"/>
        <xs:fractionDigits value="5"/>
    </xs:restriction>
</xs:simpleType>

<xs:simpleType name="T1">
    <xs:restriction base="T0">
        <xs:minInclusive value="0"/>
        <xs:maxInclusive value="100"/>
    </xs:restriction>
</xs:simpleType>

<xs:simpleType name="T2">
    <xs:restriction base="T1">
        <xs:fractionDigits value="1"/>
        <xs:maxInclusive value="1"/>
    </xs:restriction>
</xs:simpleType>
```

| Típusdefiníció | minInclusive | fractionDigits | maxInclusive |
|---|---|---|---|
| T0 | 0 | 5 | |
| T1 | 0 | 5 | 100 |
| T2 | 0 | 1 | 1 |

***Rossz alkalmazás***

```
<xs:simpleType name="baseString">
    <xs:restriction base="xs:string">
        <xs:minLength value="1"/>
        <xs:maxLength value="256"/>
    </xs:restriction>
</xs:simpleType>

<xs:simpleType name="illegalString">
    <xs:restriction base="baseString">
        <xs:minLength value="0"/>
        <xs:maxLength value="100"/>
    </xs:restriction>
</xs:simpleType>

<xs:simpleType name="fixedLengthString">
    <xs:restriction base="baseString">
        <xs:length value="10"/>
    </xs:restriction>
</xs:simpleType>
```

#### Adattípusok származtatása listaképzéssel

```
<xs:simpleType name="név">
    <xs:list itemType="elemtípus"/>  (felső szintű típusdefiníció használata)
</xs:simpleType>

<xs:simpleType name="név">
    <xs:list>
        <xs:simpleType>  (névtelen típusdefiníció használata)
            ...
        </xs:simpleType>
    </xs:list>
</xs:simpleType>
```

***Példa:*** 
* `LotteryNumbers` elemben tetszőleges számú whitespace karakterrel elválasztott, 1 és 90 közötti egész szám -> `integer`
* `WinnigNumberList` elemben pont 5 ilyen literál

```
<xs:simpleType name="LotteryNumber">
    <xs:restriction base="xs:integer">
        <xs:minInclusive value="1"/>
        <xs:maxInclusive value="90"/>
    </xs:restriction>
</xs:simpleType>

<xs:simpleType name="LotteryNumberList">
    <xs:list itemType="LotteryNumber"/>
</xs:simpleType>

<xs:simpleType name="WinningNumberList">
    <xs:restriction base="LotteryNumberList">
        <xs:length value="5"/>
    </xs:restriction>
</xs:simpleType>

<xs:element name="LotteryNumbers" type="LotteryNumberList"/>

<xs:element name="WinningNumbers" type="WinningNumberList"/>
```

#### Adattípusok származtatása unióképzéssel

***Példák***

```
<xs:simpleType name="dateOrYear">
    <xs:union memberTypes="xs:date xs:gYear"/>
</xs:simpleType>
```

```
<xs:simpleType name="CardValue">
    <xs:union>
        <xs:simpleType>
            <xs:restriction base="xs:integer">
                <xs:minInclusive value="2"/>
                <xs:maxInclusive value="10"/>
            </xs:restriction>
        </xs:simpleType>
        <xs:simpleType>
            <xs:restriction base="xs:token">
                <xs:enumeration value="Jack"/>
                <xs:enumeration value="Queen"/>
                <xs:enumeration value="King"/>
                <xs:enumeration value="Ace"/>
            </xs:restriction>
        </xs:simpleType>
    </xs:union>
</xs:simpleType>
```

```
<xs:simpleType name="isbn10">
    <xs:restriction base="xs:string">
        <xs:pattern value="\d{9}[\dX]"/>
    </xs:restriction>
</xs:simpleType>

<xs:simpleType name="isbn13">
    <xs:restriction base="xs:string">
        <xs:pattern value="\d{13}"/>
    </xs:restriction>
</xs:simpleType>

<xs:simpleType name="isbn">
    <xs:union memberTypes="isbn10 isbn13"/>
</xs:simpleType>
```

#### Származtatás korlátozása

***Példák***

```
<xs:simpleType name="shortString" final="#all">
    <xs:restriction base="xs:string">
        <xs:maxLength value="10"/>
    </xs:restriction>
</xs:simpleType>
```

***Példák***

```
<xs:simpleType name="unitIntervalValue">
    <xs:restriction base="xs:decimal">
        <xs:minInclusive value="0" fixed="true"/>
        <xs:maxInclusive value="1" fixed="true"/>
    </xs:restriction>
</xs:simpleType>
```

***Érvényes a következő származtatás***

```
<xs:simpleType>
    <xs:restriction base="unitIntervalValue">
        <xs:fractionDigits value="2"/>
        <xs:maxInclusive value="1"/>
    </xs:restriction>
</xs:simpleType>
```

#### Az anySimpleType adattípus

### 5. Komplex típusok

#### Komplex típusok definiálása

***Példák***

```
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">

    <xs:complexType name="event">
        <xs:sequence>
            <xs:element name="date" type="xs:date"/>
            <xs:element name="place" type="xs:string"/>
        </xs:sequence>
    </xs:complexType>

    <xs:element name="birth" type="event"/>
    <xs:element name="death" type="event"/>
    ...
</xs:schema>
```

Névtelen:

```
<xs:element name="param">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="name" type="xs:string"/>
            <xs:element name="value" type="xs:string"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

#### Csak elmeket tartalmazó elemek

```
<xs:complexType name="név">    (felső szintű típusdefiníció)
    tartalommodellt megadó elem
</xs:complexType>

<xs:complexType>               (névtelen típusdefiníció)
    tartalommodellt megadó elem
</xs:complexType>
```

[Komplex típus definíciójának megszorítása](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#complex-type-restriction)

##### Tartalommodellek

***DTD-ben:***

```
<!ELEMENT d ((a,b,c)|(a,c,b)|(b,a,c)|(b,c,a)|(c,a,b)|(c,b,a))>
```

***Az XML Schema megoldása:***

```
<xs:element name="d">
    <xs:complexType>
        <xs:all>
            <xs:element ref="a"/>
            <xs:element ref="b"/>
            <xs:element ref="c"/>
        </xs:all>
    </xs:complexType>
</xs:element>
```

##### Modellcsoportok

***A `sequence` modellcsoport***

```
<xs:element name="file">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="uri" type="xs:anyURI"/>
            <xs:element name="description" type="xs:string" minOccurs="0"/>
            <xs:element name="size" type="xs:nonNegativeInteger"/>
            <xs:element name="contentType" type="xs:string"/>
            <xs:element name="lastModified" type="xs:dateTime" minOccurs="0"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

```
<xs:element name="data">
    <xs:complexType>
        <xs:sequence minOccurs="0" maxOccurs="unbounded">
            <xs:element ref="block"/>
            <xs:element ref="checksum"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

***A `choice` modellcsoport***

***Példák***

```
<xs:element name="value">
    <xs:complexType>
        <xs:choice>
            <xs:element name="float" type="xs:float"/>
            <xs:element name="int" type="xs:int"/>
            <xs:element name="string" type="xs:string"/>
        </xs:choice>
    </xs:complexType>
</xs:element>
```

***Érvényes***

```
<value><float>1E-5</float></value>
<value><int>1024</int></value>
<value><string>C-3PO</string></value>
```

```
<xs:element name="array">
    <xs:complexType>
        <xs:choice>
            <xs:element name="float" type="xs:float" maxOccurs="unbounded"/>
            <xs:element name="int" type="xs:int" maxOccurs="unbounded"/>
            <xs:element name="string" type="xs:string" maxOccurs="unbounded"/>
        </xs:choice>
    </xs:complexType>
</xs:element>
```

***Érvényes***

```
<array>
    <string>George</string>
    <string>John</string>
    <string>Paul</string>
    <string>Ringo</string>
</array>
```

***2***

```
<xs:element name="array">
    <xs:complexType>
        <xs:choice maxOccurs="unbounded">
            <xs:element name="float" type="xs:float"/>
            <xs:element name="int" type="xs:int"/>
            <xs:element name="string" type="xs:string"/>
        </xs:choice>
    </xs:complexType>
</xs:element>
```

***Érvényes***

```
<array>
    <string>Mace Windu</string>
    <int>42</int>
    <string>Obi-Wan Kenobi</string>
    <float>123.0</float>
    <string>Qui-Gon Jinn</string>
</array>
```

***Az `all` modellcsoport***

***Példák***

```
<xs:element name="address">
    <xs:complexType>
        <xs:all>
            <xs:element name="street" type="xs:string"/>
            <xs:element name="city" type="xs:string"/>
            <xs:element name="state" type="xs:string" minOccurs="0" maxOccurs="1"/>
            <xs:element name="postalCode" type="xs:string"/>
            <xs:element name="country" type="xs:string"/>
        </xs:all>
	</xs:complexType>
</xs:element>
```

***Érvényes***

```
<address>
    <city>Debrecen</city>
    <street>Egyetem tér 1.</street>
    <postalCode>4032</postalCode>
    <country>Hungary</country>
</address>

<address>	
    <street>456 Kent Street</street>
    <city>Sydney</city>
    <state>NSW</state>
    <postalCode>2000</postalCode>
    <country>Australia</country>
</address>
```

##### Modellcsoportokra vonatkozó korlátozások

***Nem megengedett modellcsoport***

```
<xs:choice>
    <xs:element name="value" type="xs:int"/>
    <xs:element name="value" type="xs:string"/>
</xs:choice>

<xs:sequence>
    <xs:element name="value" type="xs:int"/> 
    <xs:element name="value" type="xs:string"/>
</xs:sequence>

<xs:sequence>
    <xs:choice>
        <xs:element name="value1" type="xs:int"/>
        <xs:element name="value2" type="xs:string"/>
    </xs:choice> 
    <xs:element name="value1" type="xs:string"/>
</xs:sequence>
```

***Nem egyértelmű modellcsoport***

```
<xs:sequence>
    <xs:choice>
        <xs:element ref="A"/>
        <xs:element ref="B" minOccurs="0"/>
    </xs:choice>
    <xs:choice>
        <xs:element ref="A"/>
        <xs:element ref="C"/>
    </xs:choice>
</xs:sequence>
```

***Egyértelmű***

```
<xs:sequence>
    <xs:choice>
        <xs:element ref="A"/>
        <xs:element ref="B"/>
    </xs:choice>
    <xs:choice>
        <xs:element ref="A"/>
        <xs:element ref="C"/>
    </xs:choice>
</xs:sequence>
```

##### Modellcsoport-definícók

```
<xs:group ref="név"/>
```

***Példák***

```
<xs:group name="startAndEndDate">
    <xs:sequence>
        <xs:element name="startDate" type="xs:date"/>
        <xs:element name="endDate" type="xs:date"/>
    </xs:sequence>
</xs:group>
```

***Felhasználása egy komplex típus tartalommodelljéhez:***

```
<xs:element name="event">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="title" type="xs:string"/>
            <xs:group ref="startAndEndDate"/>
            <xs:element name="location" type="xs:string"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

#### Vegyes tartalmú elemek

***DTD-ben***

```
<!ELEMENT para (#PCDATA|bold|italic)*>
```

***XML Schemában:***

```
<xs:element name="para">
    <xs:complexType mixed="true">
        <xs:choice minOccurs="0" maxOccurs="unbounded">
            <xs:element ref="bold"/>
            <xs:element ref="italic"/>
        </xs:choice>
    </xs:complexType>
</xs:element>
```

***Példák***

```
<xs:element name="letter">
    <xs:complexType mixed="true">
        <xs:sequence>
            <xs:element name="salutation" type="mixedContent"/>
            <xs:element name="valediction" type="mixedContent"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>

<xs:complexType name="mixedContent" mixed="true">
    <xs:sequence>
        <xs:element name="name" type="xs:string"/>
    </xs:sequence>
</xs:complexType>
```

***Érvényes***

```
<letter>
    <salutation>Szeretve tisztelt <name>uram</name>,</salutation>
    üdvözlöm a Kárpátok peremén. Már igen várom. Aludjon jól az éjszaka.
    Holnap háromkor indul a delizsánsz Bukovinába. Helyet foglaltattam
    rajta. A Borgói-szorosban kocsim várni fogja és elhozza énhozzám.
    Remélem, jól utazott Londonból, és kellemesen tölti majd napjait az
    én kies vidékemen.
    <valediction>Szolgája
        <name>Drakula</name>
    </valediction>
</letter>
```

#### Tulajdonságok használata

```
<xs:element name="bookmark">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="tag" type="xs:token" minOccurs="1" maxOccurs="unbounded"/>
        </xs:sequence>
        <xs:attribute name="uri" type="xs:anyURI" use="required"/>
        <xs:attribute name="title" type="xs:string" use="required"/>
    </xs:complexType>
</xs:element>
```

***Érvényes***

```
<bookmark uri="http://www.porcupinetree.com/" title="Porcupine Tree - Official Website">
    <tag>progressive</tag>
    <tag>rock</tag>
    <tag>metal</tag>
    <tag>music</tag>
    <tag>band</tag>
</bookmark>
```

##### Szövegtartalmú elemek tulajdonságokkal

```
<xs:complexType name="név">
    <xs:simpleContent>
        <xs:extension base="alaptípus">
            tulajdonságok használatára vonatkozó elemek
        </xs:extension>
    </xs:simpleContent>
</xs:complexType>
```

***Tulajdonsággal rendelkező szövegtartalmú elem használata***

```
<xs:element name="image">
    <xs:complexType>
        <xs:simpleContent>
            <xs:extension base="xs:anyURI">
                <xs:attribute name="width" type="xs:nonNegativeInteger" use="optional"/>
                <xs:attribute name="height" type="xs:nonNegativeInteger" use="optional"/>
            </xs:extension>
        </xs:simpleContent>
    </xs:complexType>
</xs:element>
```

***Az elem lehetséges előfordulása***

```
<image width="72" height="48">http://www.w3.org/Icons/w3c_home.png</image>
```

***Példák***

```
<xs:simpleType name="myDecimal">
    <xs:restriction base="xs:decimal">
        <xs:minInclusive value="0"/>
        <xs:fractionDigits value="2"/>
    </xs:restriction>
</xs:simpleType>

<xs:element name="price">
    <xs:complexType>
        <xs:simpleContent>
            <xs:extension base="myDecimal">
                <xs:attribute name="currency" use="optional" default="EUR">
                    <xs:simpleType>
                        <xs:restriction base="xs:token">
                            <xs:enumeration value="CHF"/>
                            <xs:enumeration value="EUR"/>
                            <xs:enumeration value="USD"/>
                        </xs:restriction>
                    </xs:simpleType>    
                </xs:attribute>
            </xs:extension>
        </xs:simpleContent>
    </xs:complexType>
</xs:element>
```

#### Üreselemek

```
<xs:element name="point">
    <xs:complexType>
        <xs:attribute name="x" type="xs:double" use="required"/>
        <xs:attribute name="y" type="xs:double" use="required"/>
    </xs:complexType>
</xs:element>
```

Példa a `point` elem előfrodulására előbbi alapján

```
<point x="-0.459372" y="0.046004"/>
```

```
<xs:element name="newline">
    <xs:complexType/>
</xs:element>
```

Példa az elem előfordulására:

```
<newline/>
```

#### Komplex típusok megszorítása és kiterjesztése

##### Komplex típus definíciójának kiterjesztése

```
<xs:complexType name="név">
    <xs:complexContent>
        <xs:extension base="alaptípus">
            tartalommodellt megadó elem
            tulajdonságok használatára vonatkozó elemek
        </xs:extension>
    </xs:complexContent>
</xs:complexType>
```

* A származtatott típus tartalommodellje egy olyan `sequence` modellcsoportként tekinthető, amelyben az alaptípus tartalommodelljét az `extension` elemben megadott tartalommodell követi.

```
<xs:complexType name="eventType">
    <xs:sequence>
            <xs:element name="date" type="xs:date"/>
            <xs:element name="place" type="xs:string"/>
    </xs:sequence>
</xs:complexType>

<xs:element name="birth" type="eventType"/>

<xs:element name="death">
    <xs:complexType>
        <xs:complexContent>
            <xs:extension base="eventType">
                <xs:sequence>
                    <xs:element name="cause" type="xs:string" minOccurs="0"/>
                </xs:sequence>
            </xs:extension>
        </xs:complexContent>
    </xs:complexType>
</xs:element>

<xs:element name="person">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="name" type="xs:string"/>
            <xs:element ref="birth"/>
            <xs:element ref="death" minOccurs="0"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

`person` elem lehetséges előfordulása:

```
<person>
    <name>John F. Kennedy</name>
    <birth>
        <date>1917-05-29</date>
        <place>Brookline, Massachusetts, U.S.</place>
    </birth>
    <death>
        <date>1963-11-22</date>
        <place>Dallas, Texas, U.S.</place>
        <cause>assassination</cause>
    </death>
</person>
```

***Új típus tartalommodellje***

```
<xs:sequence>
    <xs:sequence>
        <xs:element name="date" type="xs:date"/>
        <xs:element name="place" type="xs:string"/>
    </xs:sequence>
    <xs:sequence>
        <xs:element name="cause" type="xs:string" minOccurs="0"/>
    </xs:sequence>
</xs:sequence>
```

***Példák***

```
<xs:complexType name="CelestialObjectType">
    <xs:sequence>
        <xs:element name="mass" type="xs:double"/>
    </xs:sequence>
    <xs:attribute name="id" type="xs:ID" use="required"/>
</xs:complexType>

<xs:complexType name="PlanetType">
    <xs:complexContent>
        <xs:extension base="CelestialObjectType">
            <xs:sequence>
                <xs:element name="hasMoon" minOccurs="0" maxOccurs="unbounded">
                    <xs:complexType>
                        <xs:attribute name="ref" type="xs:IDREF" use="required"/>
                   </xs:complexType>
                </xs:element>
            </xs:sequence>
        </xs:extension>
    </xs:complexContent>
</xs:complexType>

<xs:element name="SolarSystem">
    <xs:complexType>
        <xs:sequence>
            <xs:element ref="CelestialObject" minOccurs="0" maxOccurs="unbounded"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>

<xs:element name="CelestialObject" type="CelestialObjectType"/>

<xs:element name="Planet" type="PlanetType" substitutionGroup="CelestialObject"/>
```

`SolarSystem` lehetséges előfordulása:

```
<SolarSystem>

    <Planet id="MARS">
        <mass>6.421e+23</mass>
        <hasMoon ref="PHOBOS"/>
        <hasMoon ref="DEIMOS"/>
    </Planet>

    <CelestialObject id="PHOBOS">
        <mass>1.08e+16</mass>
    </CelestialObject>

    <CelestialObject id="DEIMOS">
        <mass>1.80e+15</mass>
    </CelestialObject>

</SolarSystem>
```

##### Komplex típus definíciójának megszorítása

```
<xs:complexType name="név">
    <xs:complexContent>
        <xs:restriction base="alaptípus">
            tartalommodellt megadó elem
            tulajdonságok használatára vonatkozó elemek
        </xs:restriction>
    </xs:complexContent>
</xs:complexType>
```

***Példák***

```
<xs:complexType name="PersonType">
    <xs:sequence>
        <xs:choice>
            <xs:sequence>
                <xs:element name="givenName" type="xs:string"/>
                <xs:element name="surname" type="xs:string"/>
            </xs:sequence>
            <xs:element name="name" type="xs:string"/>
        </xs:choice>
        <xs:element name="email" type="xs:string" minOccurs="0" maxOccurs="unbounded"/>
        <xs:element name="homePage" type="xs:anyURI" minOccurs="0" maxOccurs="unbounded"/>
    </xs:sequence>
    <xs:attribute name="nick" type="xs:string" use="optional"/>
</xs:complexType>

<xs:element name="Person" type="PersonType"/>
```

***Érvényes előfordulások:***

```
<Person nick="TimBL">
    <givenName>Timothy John</givenName>
    <surname>Berners-Lee</surname>
    <email>timbl@w3.org</email>
    <homePage>http://www.w3.org/People/Berners-Lee/</homePage>
</Person>

<Person>
    <givenName>Mark</givenName>
    <surname>Zuckerberg</surname>
</Person>

<Person nick="DOS">
    <name>Daniel O’Sullivan</name>
    <email>mothlite@gmail.com</email>
    <homePage>http://www.myspace.com/danielohsullivan</homePage>
    <homePage>http://www.mothlite.org/</homePage>
    <homePage>http://mothlite.blogspot.com/</homePage>
</Person>
```

***`PersonType` típus megszorítása***

```
<xs:complexType name="SimplePersonType">
    <xs:complexContent>
        <xs:restriction base="PersonType">
            <xs:sequence>
                <xs:element name="name" type="xs:string"/>
                <xs:element name="email" type="xs:string" minOccurs="1"/>
                <xs:element name="homePage" type="xs:anyURI" minOccurs="0" maxOccurs="1"/>
            </xs:sequence>
            <xs:attribute name="nick" use="required">
                <xs:simpleType>
                    <xs:restriction base="xs:string">
                        <xs:maxLength value="10"/>
                    </xs:restriction>
                </xs:simpleType>
            </xs:attribute>
        </xs:restriction>
    </xs:complexContent>
</xs:complexType>
```

##### Származtatás korlátozása

#### Polimorfizmus

***Példák***

```
<xs:complexType name="eventType">
    <xs:sequence>
        <xs:element name="date" type="xs:date"/>
        <xs:element name="place" type="xs:string"/>
    </xs:sequence>
</xs:complexType>

<xs:element name="birth" type="eventType"/>

<xs:complexType name="DeathType">
    <xs:complexContent>
        <xs:extension base="eventType">
            <xs:sequence>
                <xs:element name="cause" type="xs:string" minOccurs="0"/>
            </xs:sequence>
        </xs:extension>
    </xs:complexContent>
</xs:complexType>

<xs:element name="death" type="DeathType"/>
```

***Felhasználható:***

```
<birth xsi:type="DeathType">
    <date>1981-12-02</date>
    <place>McComb, Mississippi, U.S.</place>
    <cause>OOPS</cause>
</birth>
```

#### Absztrakt típusok

```
<xs:simpleType name="isbn">
    <xs:restriction base="xs:string">
        <xs:pattern value="\d{13}"/>
	</xs:restriction>
</xs:simpleType>

<xs:simpleType name="issn">
    <xs:restriction base="xs:string">
        <xs:pattern value="\d{4}-\d{3}[\dX]"/>
    </xs:restriction>
</xs:simpleType>

<xs:complexType name="PublicationType" abstract="true">
    <xs:sequence>
        <xs:element name="title" type="xs:string"/>
        <xs:element name="publisher" type="xs:string"/>
    </xs:sequence>
</xs:complexType>

<xs:complexType name="BookType">
    <xs:complexContent>
        <xs:extension base="PublicationType">
            <xs:sequence>
                <xs:element name="isbn" type="isbn"/>
            </xs:sequence>
        </xs:extension>
    </xs:complexContent>
</xs:complexType>

<xs:complexType name="PeriodicalType">
    <xs:complexContent>
        <xs:extension base="PublicationType">
            <xs:sequence>
                <xs:element name="issn" type="issn"/>
            </xs:sequence>
        </xs:extension>
    </xs:complexContent>
</xs:complexType>

<xs:element name="Publication" type="PublicationType"/>

<xs:element name="Publications">
    <xs:complexType>
        <xs:sequence>
            <xs:element ref="Publication" minOccurs="0" maxOccurs="unbounded"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

***Nem megengedett***

```
<Publication>
    <title>...</title>
    <publisher>...<publisher>
</Publication>

<Publication xsi:type="PublicationType">
    <title>...</title>
    <publisher>...<publisher>
</Publication>
```

***Megengedett***

```
<Publication xsi:type="PeriodicalType">
    <title>Journal of Statistical Software</title>
    <publisher>American Statistical Association</publisher>
    <issn>1548-7660</issn>
</Publication>

<Publication xsi:type="BookType">
    <title>World War Z &#8211; Zombiháború</title>
    <publisher>Könyvmolyképző Kiadó</publisher>
    <isbn>9789632452753</isbn>
</Publication>
```

***Definiálható így is:***

```
<xs:complexType name="PublicationType" abstract="true">
    <xs:sequence>
        <xs:element name="title" type="xs:string"/>
        <xs:element name="publisher" type="xs:string"/>
        <xs:choice>
            <xs:element name="isbn" type="isbn"/>
            <xs:element name="issn" type="issn"/>
        </xs:choice>
    </xs:sequence>
</xs:complexType>
```

#### Az anyType típus

```
<xs:element name="anything" type="xs:anyType"/>
```

***Érvényes:***

```
<anything>
    Ez az <elem> megengedi, hogy tartalomként <tetszőleges/> sok tetszőleges </elem>
    és szöveg forduljon elő benne.
 </anything>
 ```

#### Helyettesítők

***Elemhelyettesítők használata***

```
<xs:element name="note">
    <xs:complexType>
        <xs:sequence>
            <xs:any namespace="http://www.w3.org/1999/xhtml" minOccurs="0"
                maxOccurs="unbounded" processContents="lax"/>
	       </xs:sequence>
    </xs:complexType>
</xs:element>
```

A `comment` elem egy lehetséges előfordulása:

```
<note>
    <p xmlns="http://www.w3.org/1999/xhtml">See
        <a href="http://www.w3.org/XML/Schema">http://www.w3.org/XML/Schema</a>
        for more information.</p>
</note>
```

***Tulajdonság-helyettesítő használata***

```
<xs:element name="myLink">
    <xs:complexType>
        <xs:simpleContent>
            <xs:extension base="xs:string">
                <xs:anyAttribute namespace="http://www.w3.org/1999/xlink"
                    processContents="lax"/>
            </xs:extension>
        </xs:simpleContent>
    </xs:complexType>
</xs:element>
```

A `myLink` elem egy lehetséges előfordulása:


```
<myLink xmlns:xlink="http://www.w3.org/1999/xlink"
    xlink:type="simple" xlink:href="http://www.w3.org/">
    World Wide Web Consortium (W3C)
</myLink>
```

### 6. Azonossági megszorítások

#### Bevezetés

#### Azonossági megszorítások definiálása

##### XPath elérési útvonalak

#### Szematika

##### `key`

***Példák***

```
<xs:element name="books">
    <xs:complexType>
        <xs:sequence>
            <xs:element ref="book" minOccurs="0" maxOccurs="unbounded"/>
        </xs:sequence>
    </xs:complexType>
    <xs:key name="book-key">
        <xs:selector xpath="book"/>
        <xs:field xpath="isbn"/>
    </xs:key>
</xs:element>

<xs:element name="book">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="author" type="xs:string"/>
            <xs:element name="title" type="xs:string"/>
            <xs:element name="isbn">
                <xs:simpleType>
                    <xs:restriction base="xs:string">
                        <xs:pattern value="\d{13}"/>
                    </xs:restriction>
                </xs:simpleType>
            </xs:element>
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

***books elem lehetséges előfordulása:***

```
<books>
    <book>
        <author>Mihail Bulgakov</author>
        <title>A Mester és Margarita</title>
        <isbn>9789630787208</isbn>
    </book>
    <book>
        <author>George Orwell</author>
        <title>1984</title>
        <isbn>9789630788120</isbn>
    </book>
    <book>
        <author>Umberto Eco</author>
        <title>A rózsa neve</title>	
        <isbn>9789630785785</isbn>
    </book>
    <book>
        <author>Bram Stoker</author>
        <title>Drakula</title>
        <isbn>9879630789448</isbn>
    </book>
</books>
```

##### `keyref`

***Példák***

```
<xs:element name="dictionary">
    <xs:complexType>
        <xs:sequence>
            <xs:element ref="entry" minOccurs="0" maxOccurs="unbounded"/>
        </xs:sequence>
    </xs:complexType>
    <xs:key name="entry-key">
        <xs:selector xpath="entry"/>
        <xs:field xpath="term"/>
    </xs:key>
    <xs:keyref name="entry-ref" refer="entry-key">
        <xs:selector xpath="entry/see"/>
        <xs:field xpath="."/>
    </xs:keyref>
</xs:element>

<xs:element name="entry">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="term" type="xs:string"/>
            <xs:element name="definition" type="xs:string"/>
            <xs:element name="see" type="xs:string" minOccurs="0" maxOccurs="unbounded"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

***dictionary*** elem lehetséges előfordulása

```
<dictionary>
    <entry>
        <term>Internet</term>
        <definition>A TCP/IP protokollra épülő globális számítógép-hálózat.</definition>
    </entry>
    <entry>
        <term>World Wide Web (WWW)</term>
        <definition>Az Interneten működő globális hipertext rendszer.</definition>
        <see>Internet</see>
        <see>World Wide Web Consortium (W3C)</see>
    </entry>
    <entry>
        <term>World Wide Web Consortium (W3C)</term>
        <definition>WWW szabványokért felelős nemzetközi szervezet.</definition>
        <see>World Wide Web (WWW)</see>
    </entry>
</dictionary>
```

##### `unique`

***Példák***

```
<xs:element name="books">
    <xs:complexType>
        <xs:sequence>
            <xs:element ref="book" maxOccurs="unbounded"/>
        </xs:sequence>
    </xs:complexType>
    <xs:unique name="book-key">
        <xs:selector xpath="book"/>
        <xs:field xpath="isbn"/>
    </xs:unique>
</xs:element>

<xs:element name="book">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="author" type="xs:string"/>
            <xs:element name="title" type="xs:string"/>
            <xs:element name="isbn" minOccurs="0" maxOccurs="1" nillable="true">
                <xs:simpleType>
                    <xs:restriction base="xs:string">
                        <xs:pattern value="[0-9]{13}"/>
                    </xs:restriction>
                </xs:simpleType>
            </xs:element>
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

***books*** elem lehetséges előfordulása

```
<books xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<book>
        <author>Mihail Bulgakov</author>
        <title>A Mester és Margarita</title>
        <isbn>9789630787208</isbn>
    </book>
    <book>
        <author>George Orwell</author>
        <title>1984</title>
        <isbn>9789630788120</isbn>
    </book>
    <book>
        <author>Umberto Eco</author>
        <title>A rózsa neve</title>	
        <isbn xsi:nil="true"/>
    </book>
    <book>
        <author>Bram Stoker</author>
        <title>Drakula</title>
    </book>
    <book>
        <author>Steven Saylor</author>
        <title>Egy gladiátor csak egyszer hal meg</title>
    </book>
</books>
```

[Példák](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#d6e2764)

### 7. Névterek

[Névterek](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#d6e3028)

### 8. Példányok

[Példányok](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#instances)

### 9. További lehetőségek

[További lehetőségek](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#further-options)

### 10. Esettanulmány

[Esettanulmány](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#case-study)

## A. Beépített adattípusok

[Beépített adattípusok](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#builtin-datatypes)

## B. Korlátozó adattípus-tulajdonságok

[Korlátozó adattípus-tulajdonságok](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#constraining-facets)

## C. Dokumentumok az Esettanulmány című fejezethez

[Dokumentumok az Esettanulmány című fejezethez](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#case-study-appendix)

## D. Sémadokumentumok manipulálása

[Sémadokumentumok manipulálása](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#schema-editing)

[Tartalomjegyzék](#tartalomjegyzék)

---
[^1]: Jeszenszky Péter: XML sémanyelvek, 2010.
[Könyv elérhetősége](https://arato.inf.unideb.hu/jeszenszky.peter/xml/book/#d6e30)
---
