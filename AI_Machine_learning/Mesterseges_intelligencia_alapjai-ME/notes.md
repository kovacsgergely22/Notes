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
* **Logikai játékok** (logical games)
* **Tételbizonyítás**
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