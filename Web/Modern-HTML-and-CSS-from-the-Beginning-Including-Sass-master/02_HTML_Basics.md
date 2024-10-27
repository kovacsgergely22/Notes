# HTML Basic témakör jegyzetek

## 3. Doctype & Basic Layout

* [W3School Doctype](https://www.w3schools.com/tags/tag_doctype.asp)
* Comment: `<!-- -->`
  * Block Comment: `Shift + Alt + A`
  * Line Comment: `Ctrl + ü`
* Chrome-ban forráskód megjelenítése új lapon: `Ctrl + U`

---

## 4. Setting Up Live Server (VS Code Extension)

* `!` Beírása után a VsCode Emmet kiegészíti automatikusan az alap fejlécet
* Live Server extension telepítése és használata
* 5500-as porton fut

---

## 5. Meta Tags & Search Engines

***Attribútumok***
* `<html lang="en">`
* Fejlécben `<head>  </head>` tagek között
  * `<meta>` tagek
    * `"charset"` -> character set, encoding -> UTF8 -> Unicode
    * `name="viewport"` -> eltérő méretű eszközök használatához -> laptop, tablet, telefon
    * `http-equip` -> böngésző kompatibilitás -> `"ie=edge"` -> régi böngészők miatt -> kevesen használják
    * `<meta name="description" content="Thisis my website description">` -> Weboldal leírása, jellemzése a böngészők számára
    * `<meta name="keywords" content="">` idézőjelek közé 8-12 kulcsszó
    * `<meta name="robots" content="NOINDEX, NOFOLLOW">` -> a keresők nem indexelik és nem követik a weboldalt
* SEO -> Sarch Engine Optimization -> 
  * `<title>` tartalma fontos
    * leíró jellegű cím | Tevékenységi kör | cégnév a `<title> </title>` tagek között
  * `<meta name="description" content="Thisis my website description">`
  * `<meta name="keywords" content="">`
  * `<meta name="robots" content="NOINDEX, NOFOLLOW">`