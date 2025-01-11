# XML példák

## XML internal DTD-vel

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE konyvtar [
  <!ELEMENT konyvtar (konyv+)>
  <!ELEMENT konyv (cim, szerzo, kiado)>
  <!ELEMENT cim (#PCDATA)>
  <!ELEMENT szerzo (#PCDATA)>
  <!ELEMENT kiado (#PCDATA)>
]>
<konyvtar>
  <konyv>
    <cim>A kis herceg</cim>
    <szerzo>Antoine de Saint-Exupéry</szerzo>
    <kiado>Móra Könyvkiadó</kiado>
  </konyv>
  <konyv>
    <cim>A három musketeers</cim>
    <szerzo>Alexandre Dumas</szerzo>
    <kiado>Európa Könyvkiadó</kiado>
  </konyv>
</konyvtar>
```

- [Internal XML](examples/1.xml)

## XML external DTD-vel

***XML fájl:***

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE catalog SYSTEM "books.dtd">
<catalog>
  <book>
    <title>Harry Potter and the Sorcerer's Stone</title>
    <author>J.K. Rowling</author>
    <price>19.99</price>
  </book>
  <book>
    <title>The Lord of the Rings</title>
    <author>J.R.R. Tolkien</author>
    <price>29.99</price>
  </book>
</catalog>
```

***DTD fájl:***

```
<!ELEMENT catalog (book+)>
<!ELEMENT book (title, author, price)>
<!ELEMENT title (#PCDATA)>
<!ELEMENT author (#PCDATA)>
<!ELEMENT price (#PCDATA)>
```

- [External XML](examples/2.xml)
- [External XML-hez DTD](examples/books.dtd)

### XML CSS fájl használatával és XSL használatával

1. Példa

***XML fájl***

```
<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet type="text/css" href="firstXmlFile.css"?>
<FirstTag>
    This is our first XML file.
    <!-- this is comment -->
</FirstTag>
```

***CSS fájl***

```
FirstTag {
  display: block;
  font-family: Arial, Helvetica, sans-serif;
  font-size: large;
  color: brown;
}
```

- [XML fájl](examples\firstXmlFile.css)
- [CSS fájl](examples\firstXmlFile.css)

2. Példa

***XML fájl***

```
<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet type="text/css" href="businessCard.css"?>
<BusinessCard>
    <name>Steve Paul</name>
    <phone type="home">1 6554 454654</phone>
    <phone type="work">5 2461 564654</phone>
    <phone type="mobile">2 4646 456464</phone>
    <email>steve@gmail.com</email>
</BusinessCard>
```

***CSS fájl***

```
BusinessCard {
    font-family: Arial, Helvetica, sans-serif;
    background-color: #f5f5f5;
    width: 300px;
    display: block;
    padding: 10pt;
    border: 1px solid black;
    margin: 5px;
    text-align: left;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}
name {
    color: black;
    font-weight: bold;
    font-size: 140%;
    display: block;
    margin-bottom: 3%;
}
phone{
    color: black;
    font-size: 90%;
    display: block;
}
email{
    color: black;
    font-weight: bold;
    font-size: 90%;
    display: block;
    margin-top: 3%;
}
```

- [XML fájl](examples\businessCard.xml)
- [CSS fájl](examples\businessCard.css)

3. Példa

***XML fájl***

```
<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet type="text/css" href="businessCard2.css"?>

<BusinessCards>
    <BusinessCard>
        <Name>Joe Marini</Name>
        <phone type="home" primary="primary">1 6554 454654</phone>
        <phone type="work">5 2461 564654</phone>
        <phone type="mobile">2 4646 456464</phone>
        <email>steve@gmail.com</email>
    </BusinessCard>

    <BusinessCard>
        <Name>Steve Paul</Name>
        <phone type="home">1 6554 454654</phone>
        <phone type="work" primary="primary">5 2461 564654</phone>
        <phone type="mobile">2 4646 456464</phone>
        <email>someone@else.com</email>
    </BusinessCard>
</BusinessCards>
```

***CSS fájl***

```
BusinessCard {
    font-family: Arial, Helvetica, sans-serif;
    background-color: #f5f5f5;
    width: 300px;
    display: block;
    padding: 10pt;
    border: 1px solid black;
    margin: 5px;
    text-align: left;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}
name {
    color: black;
    font-weight: bold;
    font-size: 140%;
    display: block;
    margin-bottom: 3%;
}
phone{
    color: black;
    font-size: 90%;
    display: block;
}
phone::before {content : attr(type) ": "}
phone[primary]::after {content : "(" attr(primary) ")"}
email{
    color: black;
    font-weight: bold;
    font-size: 90%;
    display: block;
    margin-top: 3%;
}
email::before {content : "Email: "}
```

- [XML fájl](examples\businessCard2.xml)
- [CSS fájl](examples\businessCard2.css)