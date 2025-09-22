DR. MILEFF PÉTER által készített, **Unix/Linux operációs rendszer üzemeltetése** című tananyag (Miskolci Egyetem, 2022) gondolattérképe Markdown fastruktúrában, a számozási hibák korrekciójával [1].

# Unix/Linux operációs rendszer üzemeltetése

## 1. Bevezetés

### 1.1 A Unix rövid története
*   Eredetileg **1969-ben** Ken Thomson és Dennis Ritchie készítette [2].
*   1973-ban C nyelvre írták át a könnyű hordozhatóság érdekében [2].
*   Két fő változata: **BSD Unix** és az AT&T **System V (SVR4)** [3].
*   Egységesítő szabványok: OSF/1 és a **POSIX** (Portable Operating System Interface) [4, 5].

### 1.2 Elterjedt UNIX-ok
*   **Solaris:** Ma az Oracle fejleszti [6].
*   **AIX:** IBM Unix alapú rendszere, RISC/PowerPC processzoros verzióban adják ki [6].
*   **IRIX:** Silicon Graphics Inc. (SGI) fejlesztette, a fejlesztés 2006-ban leállt [7].
*   **HP-UX:** Hewlett-Packard által fejlesztett [7].
*   **Mac OSX:** Apple, Unix alapú rendszer, BSD variánsból származik [7].

### 1.3 Ismertebb BSD rendszerek
*   **FreeBSD:** A legnépszerűbb BSD származék, Unix-szerű operációs rendszer [8].
*   **PCBSD:** FreeBSD-re épülő, asztali felhasználásra fejlesztett, grafikus telepítővel [8].
*   **NetBSD:** A hordozhatóságot és a minőségi tervezést tartja szem előtt, leginkább beágyazott rendszereken jelenik meg [9].
*   **OpenBSD:** 1995-ben vált ki a NetBSD fejlesztéséből, híres a forráskód nyíltságáról és a biztonságosságról [9].
*   **DragonflyBSD:** Matthew Dillion hozta létre a FreeBSD 4.8 kiadásából [10].

### 1.4 A GNU projekt, avagy hogy kerül ide a Linux?
*   Richard Stallman kezdeményezésére alakult meg az **FSF** (Free Software Foundation) [11].
*   A **GNU projekt** (GNU is Not UNIX, 1983) célja egy teljesebb Unix rendszer létrehozása [11].
*   Jogi alapja a **GPL** (GNU General Public Licence), mely biztosítja a forráskód szabadságát [11, 12].
*   Linus Torvalds létrehozta a Linux rendszermagot (Unix-klón) [13].
*   A Linux a **POSIX** implementációjához áll a legközelebb [14].

### 1.5 Linux disztribúciók
*   A disztribúció egy Linux kernelen alapuló teljes, működőképes Unix rendszer [14].
*   1.5.1 Különbségek a disztribúciók között [15]:
    *   Célközönség, konfigurálási mód (grafikus vagy konfigurációs fájl szerkesztése) [15].
    *   Stabilitás/frissesség [15].
    *   A **csomagkezelő** (apt, rpm, yum, stb.) [16].
*   A kernelek módosítottak lehetnek (ún. vanilla kernel) [17].

### 1.6 Linux rendszer telepítése
*   1.6.1 Disztribúció kiválasztása: Kezdőknek javasoltak pl. Linux Mint, Ubuntu, Debian [18, 19].
*   1.6.2 Disztribúció kiadásának kiválasztása: Kódnevekkel illetik (pl. Debian Jessie) [19].
*   **1.6.3 Megfelelő architektúra kiválasztása** (Javított számozás) [20]:
    *   32 bites (i386, i586, i686) [20].
    *   64 bites (amd64, arm64) [20, 21].
*   **1.6.4 Telepítési módszerek és kiadások** (Javított számozás a forrás 'Kiadások' és 'Megfelelő architektúra' fejezetei alapján):
    *   DVD alapú telepítés [21].
    *   Live CD/DVD alapú telepítés (telepítés nélkül is kipróbálható) [22].
    *   Internet alapú telepíthetőség (repository-ból tölt le) [22].
    *   Különböző kiadások készülnek a főbb ablakkezelők szerint csoportosítva (pl. Cinnamon, MATE, KDE, GNOME, XFCE Edition) [23, 24].
*   1.6.5 Tényleges telepítés:
    *   Natív telepítés particionálással (saját fájlrendszer miatt) [24].
    *   Virtuális gép használata (biztonságosabb, de lassabb) [25].

## 2. A Linux működésének rövid áttekintése

### 2.1 A 386-os csoda (Javított számozás)
*   Valódi **többfeladatos (multitask)** és **többfelhasználós (multiuser)** operációs rendszer [25].
*   A kernel "védett" üzemmódot, a felhasználói folyamatok "user" üzemmódot használnak [26].
*   Perifériaművelet csak a kernel meghívásával végezhető [27].

### 2.2 Memóriakezelés röviden (Javított számozás)
*   Lapozásos virtuális memóriakezelés (swap/page terület) [28].
*   Használja a lapozás (paging) és a tárcsere (swapping) keverékét [28, 29].
*   A swap terület dinamikusan változtatható, lehet fájlként vagy külön partícióként [30, 31].
*   2.2.1 Buffer Cache alapú megoldás:
    *   Gyorsítótár a diszk-eléréshez, a mérete dinamikusan változik [31, 32].
    *   Minden diszk-írás ide kerül először [32].
    *   Szükséges a megfelelő **shutdown** procedúra az adatvesztés elkerülésére [32, 33].
*   **2.2.2 További gyorsító megoldások** (Javított számozás):
    *   Demand paging (csak a szükséges lapok töltődnek be) [34, 35].
    *   Osztott kódkönyvtárak (dinamikus linker) [35, 36].
    *   Copy-on-write mechanizmus (új folyamat létrehozásakor nem kell lemásolni a memórialapot) [36, 37].

### 2.3 A folyamatok ütemezése (Javított számozás)
*   **Preemptív időosztásos ütemezés**t alkalmaz, amely a CPU időt időszeletekre osztja [37, 38].
*   A folyamat prioritása állítható [38].
*   A Unix **nem valós-idejű** operációs rendszer (nincs szigorú felső korlát a futó állapotok közti időre) [39].

### 2.4 Több felhasználós működés (Javított számozás)
*   Minden bejelentkezett felhasználóhoz egy terminált (**tty**) rendel [40, 41].
*   Konzol terminál (a gép saját billentyűzete és monitora) [40].
*   Pszeudo-terminálok (pty/ttyp) (hálózaton vagy grafikus felületen keresztül) [41, 42].
*   2.4.1 Felhasználók megkülönböztetése:
    *   Minden felhasználónak van **UID**-je (felhasználói azonosító) és **GID**-je (csoportazonosító) [43, 44].
    *   A **root** felhasználó **UID-je 0**, jogai korlátlanok [43, 45, 46].

## 3. A Unix fájlrendszer és alapfogalmai

*   A fájlrendszer fa szerkezetű, a fájlok könyvtárakban (mappákban) helyezkednek el [45, 47].
*   A Unix/Linuxban "minden fájl" (pl. billentyűzet, képernyő, nyomtató) [47, 48].
*   Fájltípusok: Egyszerű fájlok, Jegyzékfájlok, Különleges fájlok (eszközök) [49, 50].

### 3.2 A fájlrendszer
*   Egyetlen fájlrendszer, fa szerkezetű, gyökere a **/** nevű jegyzék [50].
*   Fontos alapfogalmak:
    *   Metaadatok (belső adatstruktúra) [51].
    *   **Inode** (fájlinformációk, blokkmutatók) [52].
    *   Napló (Journaling) (csökkenti a helyreállás idejét rendszerösszeomlás után) [52, 53].
*   3.2.1 Standard jegyzékszerkezet: /bin, /dev, /etc, /home, /usr (a lemezterület 80-90%-a), /var [53-55].
    *   3.2.1.1 A **/dev jegyzék**: Speciális eszközök [56]. Kétféle típus: karakteres ("c") és blokkos ("b") [57]. (Pl.: /dev/hda1 partíciók, /dev/null, /dev/zero) [58-60].
*   3.2.2 Fájlokról részletesebben: **ls -l** (hosszú lista) [61]. Oszlopok: fájl/könyvtár jelölése, jogosultságok, linkszám, tulajdonos/csoport, méret, dátum/idő, név [62-64].
*   3.2.3 Helyettesítő karakterek:
    *   **\*** (több karaktert helyettesít) [65].
    *   **?** (pontosan egy karaktert helyettesít) [66].
    *   **[]** (felsorolás) [66].
    *   **[^]** (tagadás) [67].
*   3.2.4 Fontosabb parancsok:
    *   3.2.4.1 **pwd** (Print Working Directory) [67, 68].
    *   3.2.4.2 **cd** (Change Directory, relatív/abszolút elérési út, `..`, `~`) [68-70].
    *   3.2.4.3 **tree** (vizuális megjelenítés, nem része minden rendszernek) [71, 72].
    *   3.2.4.4 **mkdir** (Make Directory) [73].
    *   3.2.4.5 **rmdir** (üres könyvtár törlése) [74].
    *   3.2.4.6 **rm** (-r kapcsolóval rekurzív törlés) [74, 75].
    *   3.2.4.7 **mv** (mozgatás/átnevezés) [75].
    *   **3.2.4.8 cp** (Másolás, *-r* rekurzív kapcsolóval mappák másolására) [76] (A forrásban hibásan 3.2.4.5 volt).
*   3.2.5 Linux fő fájlrendszerei: Naplózó (journaling) és nem naplózó [77].
    *   3.2.5.1 **ReiserFS**: B\*-fastruktúra, jobb területkihasználás, gyors helyreállás [78, 79].
    *   3.2.5.2 **Ext2**: Régebbi, stabil, de helyreállítása lassú (*e2fsck* végigvizsgálja a teljes fájlrendszert) [79-81].
    *   3.2.5.3 **Ext3**: Ext2-re épül, támogatja a naplózást, egyszerű a frissítés Ext2-ről [81-83].
    *   3.2.5.4 **XFS**: Nagy teljesítményű 64 bites, allokációs csoportokat használ [84, 85].
    *   **3.2.5.5 Egyéb, széles körben támogatott fájlrendszerek** (Javított számozás): Pl. cramfs (tömörített ROM), ntfs (Windows NT, csak olvasható), vfat (hosszú fájlnevek) [86, 87].
*   3.2.6 Linkek:
    *   **Hard link**: Ugyanazon a köteten belül, ugyanarra az inode-ra mutató bejegyzés [88, 89].
    *   **Szimbolikus link** (soft link): Köteteken között is létrehozható [89].
    *   Létrehozás: **ln** parancs [89].
*   3.2.7 A **/proc fájlrendszer**: Nem valódi állományrendszer, a kernel szimulálja [90]. Csak a memóriában létezik (pl. PID-ek, `cpuinfo`, `kcore`) [90-92].
*   3.2.8 Fájlrendszer létrehozása:
    *   **fdisk**: Lemezrészek törlésére vagy létrehozására (interaktív) [93, 94].
    *   **mkfs**: Fájlrendszer tényleges létrehozása (`mkfs –t <típus> <eszköz>`) [95].

### 3.3 A csereterület (Swap space)
*   Nem valódi állományrendszer, az operatív memória tehermentesítésére/kiterjesztésére szolgál [96, 97].
*   Lassabb, mint az operatív memória [97].
*   Méretére nincs egyértelmű szabály, de általában nem nagyobb, mint az operatív memória kétszerese [98].
*   3.3.1 Csereterület létrehozása:
    *   Külön fájlként: (`dd`, `mkswap <fájl>`) [99, 100].
    *   Külön partíción [100, 101].
    *   Aktiválás: **swapon** [102].

### 3.4 Az fstab fájl
*   Az */etc/fstab* fájl megkönnyíti az állományrendszerek használatát [102].
*   Az **fsck** és a **mount** ebből tájékozódik [102].
*   Az oszlopok statikus adatokat tárolnak: device (pl. UUID), mount point, típus, mountolási beállítások [103-106].

### 3.5 Fájlrendszerek épségének ellenőrzése
*   **fsck** paranccsal ellenőrizhető a helyesség és érvényesség [107].
*   Csak **lecsatolt fájlrendszeren** szabad alkalmazni (kivéve a csak olvasható gyökér fájlrendszer a boot során) [108].
*   **dumpe2fs** (ext2 fájlrendszer információkhoz) [109].
*   **tunefs/tune2fs** (beállítások módosítására) [110].

### 3.6 Chroot
*   A root jegyzék ideiglenes megváltoztatása program lefuttatásának idejére [110, 111].
*   Tipikus eset: rendszer visszaállítás vagy egy program működési területének biztonsági lekorlátozása [111].

## 4. Fájlok megosztása és átvitele

*   A központi tárolás okai: Fontos információk központi tárolása, biztonsági másolatok, könnyebb adminisztráció [112, 113].

### 4.1 FTP
*   File Transfer Protocol (RFC 959, 1985) [113].
*   Pl. **vsftpd** (Very Secure FTP Daemon) [114].
*   Autentikált felhasználói hozzáférés vagy **anonymous** mód [115].
*   Az ftpd a **21-es portot** figyeli [116].

### 4.2 NFS
*   Network File System, a Unix rendszerek elterjedt megoldása fájlmegosztásra [116, 117].
*   **RPC** (Remote Procedure Call) alapú, igényli a **portmap** szolgáltatást [118].
*   Megosztások beállítása: */etc/exports* állományban [119]. Paraméterek (pl. ro/rw, all\_squash) [120].
*   Kliens oldalon a **mount** paranccsal csatolható fel [121].

### 4.3 Samba
*   **SMB** (Server Message Block) protokollt használja, amely lehetővé teszi a fájlok és nyomtatók megosztását Windows ügyfelekkel [121, 122].
*   Démonok: **smbd** (fájl- és nyomtatómegosztás, autentikáció) és **nmbd** (WINS kezelés, tallózás) [123, 124].
*   4.3.1 Samba konfiguráció: Konfigurációs állományok az */etc/samba/* jegyzékben (*smb.conf*) [125].
*   4.3.2 Egy alap szerver konfiguráció: Workgroup, NetBIOS név beállítása [126, 127].
*   4.3.3 Authentikációs beállítások: user, domain, ADS metódusok [127, 128]. Javasolt a jelszavak titkosítása (*encrypt passwords = yes*) [129]. A samba jelszavakat az *smbpasswd* programmal kell beállítani [130].
*   **4.3.4 Megosztások kezelése** (A forrásban hibásan 4.3.3 volt sorszámozva): A megosztás neve [*public*] [131], *path*, *writable*, *write list* [132, 133]. Speciális *[homes]* megosztás a felhasználók saját könyvtárához [134].
*   **4.3.5 Megosztások felcsatolása** (A forrásban hibásan 4.3.4 volt sorszámozva): **smbclient**, **mount -t smbfs** alkalmazásokkal [134, 135].

## 5. Rendszerindítás

### 5.1 Általános áttekintés (Javított számozás)
*   BIOS (POST) után beolvassa a boot szektort (MBR - Master Boot Record) [136, 137].
*   A bootstrap loader indítja a kernelt (**LILO** vagy **GRUB** segítségével) [137, 138].
*   Kernel kicsomagolja önmagát, felderíti a hardvert [138, 139].
*   Mountolja a gyökér fájlrendszert (ha ez nem sikerül, "kernel panic" lép fel) [139, 140].
*   Elindítja az **init programot (/sbin/init)**, melynek **PID-je 1** [140].

### 5.2 Az init, mint első folyamat (Javított számozás)
*   Az **init** (PID=1) fejezi be a rendszerindítást [141].
*   Az init **adoptálja** az árva (orphan) processzeket (ha a szülő folyamat előbb szűnik meg) [142, 143].
*   A legtöbb Linux terjesztés a **sysvinit**-et használja [142].

### 5.3 Futási szintek (Javított számozás)
*   A rendszer üzemmódjai (run level) [144].
*   Főbb szintek (Red Hat alapú rendszerek): **0** (Leállítás), **1** vagy **S** (Egy felhasználós), **3** (Több felhasználós), **5** (Grafikus felülettel), **6** (Újraindítás) [145, 146].
*   Lekérdezés: **runlevel** parancs [146].
*   5.3.1 Futási szintek konfigurációja:
    *   Az indítótáblázatban: */etc/inittab* [147].
    *   Formátum: *id:runlevels:action:process* [147].
    *   Módosítás: **telinit** paranccsal [148, 149].

### 5.4 Alrendszerek indítása és leállítása (Javított számozás)
*   Az init csak az elengedhetetlenül fontos alapszolgáltatásokat indítja [150].
*   A magasabb szintű szolgáltatások (alrendszerek/subsystem) indítását a futásszint-váltáskor az **/etc/rc.d/rc** program végzi [151, 152].

## 6. Felhasználók nyilvántartása

### 6.1 A felhasználói azonosítók (Javított számozás)
*   **UID** (User Identifier) és **GID** (Group Identifier) [44].
*   A felhasználók azonosítása az UID szám alapján történik [153].
*   A **root** felhasználó **UID-je 0**, jogai korlátlanok [46].

### 6.2 Felhasználók létrehozása (Javított számozás)
*   **useradd** paranccsal (létrehoz egy home jegyzéket és másolja az */etc/skel* tartalmát) [46, 154].
*   Rendszerfelhasználók az *-r* opcióval hozhatók létre (általában kisebb azonosítóval) [155, 156].

### 6.3 A felhasználó letiltása (Javított számozás)
*   `useradd -e` (lejárati dátum) [156].
*   `passwd -l` (manuális letiltás) / `passwd -u` (engedélyezés) [157, 158].

### 6.4 A felhasználó törlése (Javított számozás)
*   **userdel -r <login név>** paranccsal (törli a bejegyzést és a home jegyzéket/levelesládát) [159].

### 6.5 Felhasználó váltás (Javított számozás)
*   **su - (felhasználónév)** paranccsal (rendszergazdára váltáskor paraméter nélkül) [159, 160].

### 6.6 Felhasználók tulajdonságainak megváltoztatása (Javított számozás)
*   Héj megváltoztatása: **chsh** (Change Shell) [160]. Csak az */etc/shells* állományban szereplő programok állíthatók be [161, 162].
*   Személyes adatok megváltoztatása: **chfn** [163].
*   Egyéb adatok módosítása: **usermod** [164].

### 6.7 Csoportok adminisztrációja (Javított számozás)
*   **groupadd** és **groupdel** [165].

### 6.8 A /etc/passwd fájl (Javított számozás)
*   Az alapvető felhasználói adatbázis; 7 mező (felhasználónév, titkosított jelszó ('x'), UID, GID, teljes név, home jegyzék, login shell) [166-170].
*   A kódolt jelszavak az */etc/shadow* fájlban tárolódnak (csak root olvashatja) [171, 172].
*   A shadow fájl tartalmazza a jelszó lejárati feltételeit (Minimum/Maximum nap, Lejárat, Inaktivitás) [173, 174].
*   6.8.1 Jelszó felépítése: A kódolt jelszó részei: Prefix (algoritmus), Options, **Salt** (véletlenszerűen generált), **Hash** (kódolt lenyomat) [175-177].

## 7. Bejelentkezés a rendszerbe

### 7.1 A klasszikus bejelentkezés folyamata (Javított számozás, eredetileg 6.2)
*   Üzenetek bejelentkezéskor: **login** előtt */etc/issue* (helyi) vagy */etc/issue.net* (távoli) [178]. Sikeres bejelentkezés után: */etc/motd* (Message of the Day) [179].
*   Beléptetés: a **login** program végzi [180].
*   */etc/nologin* fájl létezésekor csak a rendszergazda léphet be [181].
*   Ha a felhasználó a **.hushlogin** rejtett állományt elhelyezi a saját könyvtárában, a login nem ellenőrzi a levelesládát és nem ír ki üzeneteket [182].
*   Naplózás: *wtmp* és *utmp* állományokban rögzítik a bejelentkezéseket és kilépéseket [182, 183].

### 7.2 A héj indulása (Javított számozás, eredetileg 6.3)
*   Legelterjedtebb héj: **BASH** (Bourne Again Shell) [184].
*   Üzemmódok: **Beléptető héj** üzemmód (login shell), **Interaktív héj** üzemmód, **Nem interaktív héj** üzemmód (script futtatás) [184-186].
*   Induláskor végrehajtott állományok (beléptető módban): */etc/profile*, *$HOME/.bash\_profile* (vagy *.bash\_login*, vagy *.profile*), majd *$HOME/.bashrc* [187, 188]. Kilépéskor: *$HOME/.bash\_logout* [188].

## 8. Az X grafikus felület

### 8.1 Az X Window System röviden (Javított számozás, eredetileg 7.1)
*   Nyitott szabványon alapuló grafikus kezelői felület [189, 190].
*   **Kliens-szerver architektúra**, a kommunikáció X protokollon keresztül történik [191].
*   8.1.1 Az X belső működése:
    *   Az X protokoll aszinkron (Xlib implementációja) [192].
    *   Ablakkezelő (window-manager) egy speciális kliens, mely a keretekkel veszi körbe az ablakokat [193].
*   8.1.2 Kliensalkalmazások és ablakkezelők:
    *   Widget könyvtárak (pl. Motif [194], **Gtk**, **Qt**) segítik az alkalmazások készítését [195, 196].
*   8.1.3 A Desktop környezet:
    *   Az egységesség és a konfigurálhatóság hiányosságai miatt jöttek létre [197, 198].
    *   Példák: **KDE**, **GNOME**, **XFCE** [198].

### 8.2 Az X elindítása (Javított számozás, eredetileg 7.2)
*   Két metódus: **startx** (session létrehozása szerveren) vagy **xdm** (X Display Manager, daemon process, munkaállomásokon) [199].
*   8.2.1 A startx működése:
    *   Az **xinit** front-endje, futtatja az *$HOME/.xinitrc* scriptet [200].
*   8.2.2 Az X session indulása:
    *   xdm esetén a rendszerszintű *Xsession script* fut, majd a felhasználó *$HOME/.xsession* vagy *$HOME/.Xclients* scriptje [201, 202].

### 8.3 X használata távoli kliensekkel (Javított számozás)
*   Az X szerver (lokális gép) és a kliens (távoli gép) hálózaton keresztül kommunikál [202, 203].
*   Authentikációs módszerek: **xhost** (host lista, nem biztonságos) [204] és **xauth** (magic cookie) [205].
*   8.3.1 Az X kliens kimenetének átirányítása:
    *   A **DISPLAY** környezeti változón keresztül adható meg a célszerver [206].
*   8.3.2 X átirányítása ssh segítségével:
    *   A legegyszerűbb és legbiztonságosabb megoldás (titkosított csatorna) [207].

## 9. Linux hálózatba kapcsolása

### 9.1 A hálózati interfészek konfigurálása (Javított számozás)
*   A hálózati eszközök dinamikusan a kernelben jönnek létre [208, 209].
*   Szabványos nevek: **lo** (loopback), **eth0** (Ethernet), **wlan0** (Wireless) [209, 210].
*   Konfiguráláshoz: **ifconfig** program (aktiválás/deaktiválás, IP cím, netmask) [211].
*   9.1.1 Perzisztens IP beállítások:
    *   Az `ifconfig`-gal beállított értékek elvesznek újraindításkor [212].
    *   Végleges beállítás konfigurációs fájlokban (pl. Redhat: */etc/sysconfig/network-scripts/ifcfg-eth0*, Debian: */etc/network/interfaces*) [213, 214].

### 9.2 A vezeték nélküli hálózati interfészek konfigurálása (Javított számozás)
*   Az **iwconfig** parancs használható a hálózat beállítására az `ifconfig` mellett [215, 216].
*   9.2.1 Kapcsolódás egy ismert vezeték nélküli hálózathoz:
    *   **iwlist wlan0 scanning** (elérhető hálózatok listázása) [217, 218].
    *   **iwconfig** (essid, mode, key, ap beállítása) [219-221].
    *   IP igénylés: **dhcpcd wlan0** [222].

### 9.3 Az útvonalválasztó táblázat (Javított számozás)
*   A rendszermag a **Route table** (útválasztó táblázat) alapján választja ki a küldési irányt [223].
*   Kezelés: **route -n** parancs (IP címekkel írja ki a táblát) [224, 225].
*   Az alapértelmezett átjáró (default gateway) a **0.0.0.0** (Destination) címet tartalmazó bejegyzés [225, 226].
*   9.3.1 Az útvonalválasztó táblázat módosítása: **route del** (törlés) és **route add** (hozzáadás) parancsokkal [227, 228].

### 9.4 Főbb konfigurációs állományok (Javított számozás)
*   Példák: */etc/host.conf*, */etc/hostname*, */etc/hosts* [229, 230].
*   */etc/inetd.conf*: Az Internet szuperszerver konfigurációs adatbázisa [230].

## 10. Folyamatok

*   Minden folyamathoz az operációs rendszer egy egyedi folyamatazonosítót (Process ID) és egy folyamat csoportazonosítót (Process Group ID) rendel [231].
*   A folyamatok szülő-gyermek relációban állnak; a szülő előbb szűnik meg, a gyermek árvává válik, és szülőjük automatikusan az **init** folyamat lesz [143].

### 10.1 A daemon folyamatok (Javított számozás)
*   Folyamatos végrehajtás alatt álló programok (hasonló, mint a Windows szolgáltatás) [232].
*   Példák:
    *   **inetd** (internet szuperszerver, dinamikusan indít más démonokat) [232, 233].
    *   **ftpd** (21-es port) [233].
    *   **httpd** (80-as port) [234].
    *   **nfsd** [235].
    *   **pop3d** (110-es port) [236].

### 10.2 A folyamatok monitorozása (Javított számozás)
*   **ps** parancs (folyamat azonosító, terminál, státusz, parancs neve) [236].
*   **top** parancs (folyamatos monitorozás, CPU használat szerint) [237].

### 10.3 Háttérfolyamatok (Javított számozás)
*   Létrehozás: *parancs &* [238].
*   Hosszú folyamatoknál: **nohup parancs &** (nem veszi figyelembe a HANGUP szignált, kilépés után is fut) [239].
*   A kimenet a *nohup.out* állományba íródik [240].

### 10.4 Kommunikáció a folyamatokkal, megszüntetés (Javított számozás)
*   **kill** parancs (szignálok küldése) [240, 241].
*   Alapértelmezett szignál: **TERM (15)** [241].
*   A **KILL (9)** szignál a legerősebb, nem maszkolható [241, 242].
*   10.4.1 Folyamat vezérlése a Bash shell-ben:
    *   **<ctrl-z>** (felfüggesztés) [243].
    *   **bg** (háttérbe helyezés), **fg** (előtérbe hozás) [244].
    *   **jobs** (listázás) [244].
*   10.4.2 Folyamatok prioritása:
    *   **nice** (indításkor) [245].
    *   **renice** (futó alkalmazásnál) [246, 247].
    *   Prioritási érték: -20-tól 19-ig (0 az alapértelmezett) [245].

### 10.5 Automatizált programindítás (Javított számozás)
*   **cron daemon** segítségével ismétlődő feladatok végezhetők idő és dátum alapján [248].
*   Fő konfigurációs állomány: */etc/crontab* [249].
*   Az idő megadása 5 mezőből áll (perc, óra, hónap napja, hónap, hét napja) [250, 251].
*   10.5.1 Felhasználók lehetőségei:
    *   **crontab** paranccsal saját crontab állomány hozható létre [252].
    *   A hozzáférés szabályozása: */etc/cron.allow* és */etc/cron.deny* [253, 254].