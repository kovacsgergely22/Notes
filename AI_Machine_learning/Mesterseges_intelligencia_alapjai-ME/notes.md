# Mesterséges intelligencia alapjai - ME

## Hogy mérik és mire használják?

***Az intelligencia mérése***
* Egzakt mérés igénye -> tesztek
* Tesztek fajtái
  * Teljesítménytesztek
  * Képességtesztek (intelligenciateszt)
* Követelmények
  * Érvényesség
  * Megbízhatóság
* Kortól kultúrától való függés

***Intelligencia tesztek készítése***
* **Sir Francis Galton**
  * **Intelligencia:** Öröklött, kivételes érzékelési és észlelési készségek -> mérései nem igazolták
  * **Korrelációs együttható**
    * **Korreláció:** Egymást kölcsönösen feltételező dolgok, vagy fogalmak viszonya, dolgok egymástól való függése, ill. egymásnak való megfelelése
* **J. Cattel:**
  * Első intelligenciateszt (1890)
  * **Emberi képességek** (57 változó):
    * **Elsődleges faktorok** (alavető emberi képességek)
    * **Másodlagos faktorok**
      * **Folyékony intelligencia** (Fluid) -> megértés, poblémahelyzet alkalmazkodás -> öröklött
      * **Krisztályos intelligencia** (Rögzült) -> megszerzett tudás és képesség alkalmazása
    * Tesztmódszerek atyja
* **Alfred Binet, Teophile Simon**
  * Teszt gyerekek iskolaérettségének vizsgálatára (3-15 éves kor között) 1905.
    * lassú felfogású gyerekek kiszűrése
  * Gondolkodási és problémamegoldási feladatok
  * Mentális kor fogalma, mentális kor skála
  * Legelterjedtebb tesztek egyike

***A Turing teszt "Imitation Game"***
* Alan Turing -> mesterséges intelligencia minősítésére
* Bíráló kérdéseket tesz fel a két tesztalanynak (gép és ember) -> ha 5 perc után sem tudja melyik a gép -> gép sikeresen teljesítette a tesztet
* Kritikák

***A mesterséges intelligencia alkalmazási területei***
1. **Logikai játékok** (logical games)
2. **Tételbizonyítás**
  * Matematikai tételek bizonyítása az alapaxiómákból kiindulva
  * **Rezolúció:** lássuk be, hogy
    * a tényekből, 
    * szabályállításokból és a 
    * bizonyítandó állítás negáltjából álló halmaz kielégíthetetlen, ellentmondásos
    * Ha sikerül -> a bizonyítandó állítás csak igaz lehet
  * **Tételbizonyítók** esetében (szemben a programozási nyelvekkel) a **felhasználó feladata:**
    * **logika** (kiinduló ismeretek, tények és szabályok) megadása
    * **vezérlés** (következtetés, bizonyítás menetének) módszere
    * Konkrét alkalmazások: QA1, QA2, QA3 programnyelvek, QA4 procedurális reprezentáció is
3. **Automatikus programozás**
  * Szoftverkészítés automatizálása -> elég feladatot specifikálni, megoldás algoritmusa és programja automatikusan készül el.
4. **Szimbolikus számítás**
  * Matematikai levezetések, algebrai manipulációk, deriválás stb. azonosságok alkalmazása adott feladatok megoldására
  * szimbolikus algebrai szoftverek: MACSYMA, REDUCE, CAMAL, LAM, ALTRAN, FORMAC, SYMBOL, MATHEMATICA
  * MATHEMATICA:
    * numerikus és szimbolikus számítások
    * automatikus alapvető egyszerűsítések
    * összetett kifejezések legegyszerűbb alakra hozása
5. **Gépi látás, képfeldolgozás**
  * mesterséges látás
  * adott kétdimenziós bittérkép -> kép leírása (alakzatok, méretek, színek, helyek paramétereivel)
  * emberi látás modellezése
  * **elektronikus recehártya** -> megkönnyíti mesterséges neurális hálók bemenő jeleinek előállítását
  * input: kétdimenziós bitmap fálj -> output: felismert objektumok és térbeli viszonyuk, fizikai jellemzőik
  * Képfeldolgozás lépései:
    * élek detektálása
    * mélység meghatározása
    * alak meghatározása az árnyékoltságból
    * vonalak címkézése
    * objektum beazonosítás, helyzet meghatározás
6. **Robotika**
  * Mit értünk alatta:
    * önálló tevékenységre képes
    * mozgásra képes
    * többnyire nyílt kinematikai láncú gép
    * a környezetével interakcióban van 
    * ismétlődő, az ember számára fáradságos és veszélyes munkát végez
  * cél -> ember helyettesítése
  * gépi intelligencia hasznosíthatósága és veszélyessége megnő
7. **Beszédfelismerés**
  * cél: emberi beszéd szöveges formára alakítása
  * szegmentálás, szavakra bontás -> gond: a beszéd szavai egybefolynak
  * fonémák és szavak leírására használt betűk között nincs egyértelmű megfeleltetés
8. **A hangjel feldolgozása**
  * cél: az információ csökkentése és a jellemzők kiemelése
  * Lépések:
    * mintavételezés, kvantálás
    * jellemzők kinyerése, keretekben, azonos időintervallumokban
    * vektorkvantálás: a keretek jellemzővektorainak a jellemzők hiperterének régióihoz rendelése
    * **beszédfelismerés** 
    * **beszélőfelismerés**
    * **statisztikai, valószínűségi adatok** felhasználása -> szavak egyértelmű felismeréséhez
9. **Számítógépes fordítás**
  * Értelmezés 4 szintje:
    * Szintaktikai
    * Szemantikai
    * Pragmatikus
    * Intencionális
10. **Korlátozás kielégítés**
  * 
11. **Cselekvési tervek generálása**
  * 
12. **Szakértőrendszerek**
  * 

***Hol találkozhatunk a mesterséges intelligenciával?***
* E-kereskedelem
  * Személyre szabott vásárlás
  * Mesterséges intelligencia alapú asszisztensek
  * Csalásmegelőzés
* Önvezető járművek
* Spam szűrő
* Arcfelismerés
* Robotika 