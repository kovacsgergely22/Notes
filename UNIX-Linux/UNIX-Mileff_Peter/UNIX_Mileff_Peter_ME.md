# 1. Bevezetés

* UNIX régi operációs rendszer, stabilan és egyre növekvő arányban
* Korábban egyetemi szféra -> banki, vállalati, adatfeldolgozó szféra
* Dinamikusság, alkalmazkodóképesség -> ugyanaz a környezet multiprocesszoros mainframe-nél és PC-n -> hardvertől, platformtól függetlenül tudja ugyanazt nyújtani

## 1.1 A UNIX rövid története

* Első változat: 1969, **Ken Thompson és Dennis Ritchie** -> *AT&T Bell* Laboratóriumában PDP-7 típusú számítógépre
* 1973-ban átírták a rendszer magját C nyelvre -> könnyű hordozhatóság
* AT&T ingyen az amerikai egyetemeknek adta a forráskódját -> 10 éven belül százezer működő UNIX rendszer
* Gyors terjedés -> egységes ellenőrzés hiánya -> számos helyi változat -> *Legjelentősebbek:*
  * Berkeley Egyetemen kifejlesztett **BSD UNIX**
  * AT&T hivatalos változata: **System V (Sytem Fiv - SVR4)** -> UNIX System Laboratories fejleszt tovább -> később felvásárolta Novell
* Népszerű -> szabványosítás fontossága
  * USL -> SVR4
  * BSD -> OSF (Open System Foundation) ajánlása: OSF/1
  * Független bizottságok (nem az érdekelt cégek támogatásával működnek) -> *IEEE* (ANSI és ISO támogatásával) a **POSIX** (Portable Operating System Interface(x)) ajánlást -> igyekszik egységesíteni a két fő szabványt
* Korán *Intel PC* alapú UNIXok is

## 1.2 Elterjedt UNIX-ok

* Solaris -> Sun Microsystems -> Oracle
* AIX
* IRIX
* HP-UX
* MAC-OSX

## 1.3 Ismertebb BSD rendszerek

* **FreeBSD**
* PCBSD megszűnt