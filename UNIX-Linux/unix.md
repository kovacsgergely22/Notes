Ez a gondolattérkép a források tartalmát rendszerezi Markdown formátumban, figyelembe véve és javítva a fejezetek eredeti számozási hibáit.

### Unix/Linux operációs rendszer üzemeltetése

A tananyagot Dr. Mileff Péter készítette a Miskolci Egyetem Gépészmérnöki és Informatikai Karán (2022) [1].

#### **1. Bevezetés** [1]

1.1 **A Unix rövid története** [2]
:   *   Eredetileg **1969-ben** Ken Thomson és Dennis Ritchie készítette [2].
:   *   1973-ban C nyelvre írták át a könnyű hordozhatóság érdekében [2].
:   *   Két fő változata: **BSD Unix** és az AT&T **System V (SVR4)** [3].
:   *   Egységesítő szabványok: OSF/1 és **POSIX** (Portable Operating System Interface) [4, 5].

1.2 **Elterjedt UNIX-ok** [6]
:   *   **Solaris** (Oracle fejleszti) [6].
:   *   **AIX** (IBM Unix alapú rendszere, RISC/PowerPC processzoros verzióban adják ki) [6].
:   *   **IRIX** (Silicon Graphics Inc., 2006-ban leállt a fejlesztése) [7].
:   *   **HP-UX** (Hewlett-Packard által fejlesztett) [7].
:   *   **Mac OSX** (Apple, Unix alapú rendszer, BSD variánsból származik) [7].

1.3 **Ismertebb BSD rendszerek** [8]
:   *   **FreeBSD** (a legnépszerűbb BSD származék, Unix-szerű operációs rendszer) [8].
:   *   **PCBSD** (FreeBSD-re épülő, asztali felhasználásra fejlesztett) [8].
:   *   **NetBSD** (a hordozhatóságot és a minőségi tervezést tartja szem előtt, leginkább beágyazott rendszereken jelenik meg) [9].
:   *   **OpenBSD** (1995-ben vált ki a NetBSD fejlesztéséből, híres a forráskód nyíltságáról és a biztonságosságról) [9].

1.4 **A GNU projekt, avagy hogy kerül ide a Linux?** [10]
:   *   Richard Stallman kezdeményezésére alakult meg az **FSF** (Free Software Foundation) [11].
:   *   A **GNU projekt** (GNU is Not UNIX, 1983) célja egy teljesebb Unix rendszer létrehozása [11].
:   *   Jogi alapja a **GPL** (GNU General Public Licence), mely biztosítja a forráskód szabadságát [12].
:   *   Linus Torvalds létrehozta a Linux rendszermagot (Unix-klón) [13].
:   *   A Linux a **POSIX** implementációjához áll a legközelebb [14].

1.5 **Linux disztribúciók** [14]
:   *   A disztribúció egy Linux kernelen alapuló teljes, működőképes Unix rendszer [14].
:   *   Különbségek a disztribúciók között [15]: célközönség, konfigurálási mód (grafikus felület vagy konfigurációs fájl szerkesztése), stabilitás/frissesség [15], és a **csomagkezelő** (apt, rpm, yum, stb.) [16].
:   *   A kernelek módosítottak lehetnek (nem hivatalos, ún. vanilla kernel) [17].

1.6 **Linux rendszer telepítése** [17]
:   *   1.6.1 Disztribúció kiválasztása (kezdőknek pl. Linux Mint, Ubuntu, Debian) [18].
:   *   1.6.2 Disztribúció kiadásának kiválasztása (kódnevekkel illetik, pl. Debian Jessie) [19].
:   *   **1.6.3 Megfelelő architektúra kiválasztása** (32 bites: i386, i586, i686; vagy 64 bites: amd64, arm64) [20, 21].
:   *   **1.6.4 Telepítési módszerek** (DVD alapú, Live CD/DVD alapú, Internet alapú telepíthetőség) [21, 22].
:   *   1.6.5 Tényleges telepítés (natív telepítés particionálással vagy virtuális gép használatával) [23, 24].

#### **2. A Linux működésének rövid áttekintése** [24]

2.1 **A 386-os csoda** [24]
:   *   Valódi **többfeladatos (multitask)** és **többfelhasználós (multiuser)** operációs rendszer [24].
:   *   A kernel "védett" üzemmódot, a felhasználói folyamatok "user" üzemmódot használnak [25].
:   *   Perifériaművelet csak a kernel meghívásával végezhető [26].

2.2 **Memóriakezelés röviden** [27]
:   *   Lapozásos virtuális memóriakezelés (swap/page terület) [27].
:   *   Használja a lapozás (paging) és a tárcsere (swapping) keverékét [28, 29].
:   *   A swap terület dinamikusan változtatható, lehet fájlként vagy külön partícióként [29, 30].
:   *   2.2.1 Buffer Cache alapú megoldás (gyorsítótár a diszk-eléréshez, dinamikus méret, minden írás ide kerül először; szükséges a megfelelő **shutdown** procedúra) [30-32].
:   *   **2.2.2 További gyorsító megoldások** (Demand paging, Osztott kódkönyvtárak, Copy-on-write mechanizmus) [33-35].

2.3 **A folyamatok ütemezése** [36]
:   *   **Preemptív időosztásos ütemezés**t alkalmaz, amely a CPU időt időszeletekre osztja [36, 37].
:   *   A folyamat prioritása állítható [37].
:   *   A Unix **nem valós-idejű (real-time)** operációs rendszer [38].

2.4 **Több felhasználós működés** [38]
:   *   Minden bejelentkezett felhasználóhoz egy terminált (**tty**) rendel [39].
:   *   **Konzol terminál:** a gép saját billentyűzete és monitora [39].
:   *   **Pszeudo-terminálok (pty/ttyp):** hálózaton vagy grafikus felületen keresztül bejelentkezett felhasználókhoz rendeli a rendszer [40].
:   *   2.4.1 Felhasználók megkülönböztetése: Minden felhasználónak van **UID**-je (felhasználói azonosító) és **GID**-je (csoportazonosító) [41]. A **root** felhasználó UID-je 0, jogai korlátlanok [41, 42].

#### **3. A Unix fájlrendszer és alapfogalmai** [42]

3.1 **Alapfogalmak**
:   *   A fájlrendszer fa szerkezetű [43]. A Unix/Linuxban "minden fájl" (pl. billentyűzet, képernyő, nyomtató) [43, 44].
:   *   Fájltípusok: Egyszerű fájlok, Jegyzékfájlok, Különleges fájlok [45, 46].

3.2 **A fájlrendszer** [46]
:   *   Egyetlen fájlrendszer, fa szerkezetű, gyökere a **/** nevű jegyzék [46].
:   *   Fontos alapfogalmak: Metaadatok [47], **Inode** (fájlinformációk, blokkmutatók) [48], Napló (Journaling) [48].
:   *   3.2.1 Standard jegyzékszerkezet (pl.: /bin, /dev, /etc, /home, /usr, /var) [49-51].
        :   *   3.2.1.1 A **/dev jegyzék** (speciális eszközök, karakteres és blokkos típusú eszközmeghajtók, pl. /dev/hd*, /dev/null, /dev/zero) [51-53].
:   *   3.2.2 Fájlokról részletesebben: **ls -l** (hosszú lista) [54]; kiírt oszlopok: fájl/könyvtár jelölése, jogosultságok, linkszám, tulajdonos/csoport, méret, dátum/idő, név [55-57].
:   *   3.2.3 Helyettesítő karakterek: **\*** (több karakter), **?** (egy karakter), **[]** (felsorolás), **[^]** (tagadás) [58-60].
:   *   3.2.4 Fontosabb parancsok: **pwd** (76), **cd** (77), **tree** (80), **mkdir** (83), **rmdir** (84), **rm** (84), **mv** (85), **cp** [61]. (Számozás javítva: **cp** 3.2.4.8-ként szerepel az `rmdir` 3.2.4.5 helyett) [61, 62].
:   *   3.2.5 Linux fő fájlrendszerei (naplózó/nem naplózó) [63]: **ReiserFS** (88), **Ext2** (90), **Ext3** (92), **XFS** (95).
        :   *   **3.2.5.5 Egyéb, széles körben támogatott fájlrendszerek** (pl.: cramfs, ntfs, vfat) [64, 65]. (Számozás javítva a 3.2.5.4 helyett) [64].
:   *   3.2.6 Linkek: Hard link (ugyanazon a köteten belül) és Szimbolikus link (soft link, kötetek között is) [66]. Létrehozás: **ln** [66].
:   *   3.2.7 A **/proc fájlrendszer**: Nem valódi állományrendszer, a kernel szimulálja [67, 68].
:   *   3.2.8 Fájlrendszer létrehozása: **fdisk** (lemeztörlés/létrehozás) [69], **mkfs** (fájlrendszer tényleges létrehozása) [70].

3.3 **A csereterület** [71]
:   *   **Swap space** (látszólagos memória, virtual memory) [71, 72].
:   *   3.3.1 Csereterület létrehozása: Külön fájlként (**dd, mkswap**) [73, 74], vagy külön partíción [74, 75]. Aktiválás: **swapon** [76].

3.4 **Az fstab fájl** [76]
:   *   Az */etc/fstab* fájl megkönnyíti az állományrendszerek használatát, az **fsck** és a **mount** is ebből tájékozódik [76]. Tartalmazza a device, mount point, típus, és mountolási beállításokat [77-79].

3.5 **Fájlrendszerek épségének ellenőrzése** [80]
:   *   **fsck** paranccsal ellenőrizhető [80]. Csak **lecsatolt fájlrendszeren** szabad alkalmazni [81].
:   *   **dumpe2fs** bővebb információt ad, a **tunefs/tune2fs** pedig a beállítások módosítására szolgál [82, 83].

3.6 **Chroot** [83]
:   *   A root jegyzék ideiglenes megváltoztatása program lefuttatásának idejére (pl. rendszer visszaállítás vagy biztonsági lekorlátozás) [83, 84].

#### **4. Fájlok megosztása és átvitele** [85]

4.1 **FTP** [86]
:   *   File Transfer Protocol (RFC 959) [86]. Pl. **vsftpd** (Very Secure FTP Daemon) [87].
:   *   Autentikált felhasználói hozzáférés vagy **anonymous** mód [88].
:   *   Az ftpd a 21-es portot figyeli [89].

4.2 **NFS** [89]
:   *   Network File System, a Unix rendszerek elterjedt megoldása fájlmegosztásra [89].
:   *   **RPC** (Remote Procedure Call) alapú, igényli a **portmap** szolgáltatást [90].
:   *   Megosztások beállítása: */etc/exports* állományban (pl. ro/rw, all\_squash) [91, 92].
:   *   Kliens oldalon a **mount** paranccsal csatolható fel [93].

4.3 **Samba** [94]
:   *   **SMB** (Server Message Block) protokollt használja, amely lehetővé teszi a fájlok és nyomtatók megosztását Windows ügyfelekkel [94, 95].
:   *   Démonok: **smbd** (fájl- és nyomtatómegosztás) és **nmbd** (WINS kezelés) [96].
:   *   4.3.1 Samba konfiguráció: Konfigurációs állományok az */etc/samba/* jegyzékben (*smb.conf*) [97].
:   *   4.3.3 Authentikációs beállítások: user (smbpasswd), domain, ADS metódusok; javasolt a jelszavak titkosítása [98, 99].
:   *   **4.3.4 Megosztások kezelése** (a forrásban 4.3.3 volt) [100]: A megosztás neve [*public*], *path*, *writable*, *write list*, speciális *[homes]* megosztás [101, 102].
:   *   **4.3.5 Megosztások felcsatolása** (a forrásban 4.3.4 volt) [102]: **smbclient**, **mount -t smbfs** alkalmazásokkal [103].

#### **5. Rendszerindítás** [103]

5.1 **Általános áttekintés** (a forrásban implicit cím volt) [104]
:   *   BIOS (POST) után beolvassa a boot szektort (MBR - Master Boot Record) [104].
:   *   A bootstrap loader indítja a kernelt (gyakran **LILO** vagy **GRUB** segítségével) [105, 106].
:   *   Kernel kicsomagolja önmagát, felderíti a hardvert, majd mountolja a gyökér fájlrendszert [106, 107].
:   *   Végül elindítja az **init programot (/sbin/init)**, melynek PID-je 1 [108].

5.2 **Az init, mint első folyamat** (a forrásban implicit cím volt) [109]
:   *   Az **init** (PID=1) fejezi be a rendszerindítást [109, 110].
:   *   Az init **adoptálja** az árva (orphan) processzeket [111].
:   *   A legtöbb Linux terjesztés a **sysvinit**-et használja [111].

5.3 **Futási szintek** (a forrásban implicit cím volt) [112]
:   *   A rendszer üzemmódjai (run level) [112].
:   *   Főbb szintek (pl. Red Hat): **0** (Leállítás), **1** vagy **S** (Egy felhasználós), **3** (Több felhasználós), **5** (Grafikus felülettel), **6** (Újraindítás) [113, 114]. Lekérdezés: **runlevel** [114].
:   *   5.3.1 Futási szintek konfigurációja: */etc/inittab* [115]. Módosítás: **telinit** [116, 117].

5.4 **Alrendszerek indítása és leállítása** (a forrásban implicit cím volt) [117]
:   *   A magasabb szintű szolgáltatások (alrendszerek/subsystem) indítását a futásszint-váltáskor az */etc/rc.d/rc* program végzi [118, 119].

#### **6. Felhasználók nyilvántartása** [120]

6.1 **A felhasználói azonosítók** (a forrásban implicit cím volt) [120]
:   *   **UID** (User Identifier) és **GID** (Group Identifier) [121].
:   *   A **root** felhasználó UID-je 0, jogai korlátlanok [122].

6.2 **Felhasználók létrehozása** (a forrásban implicit cím volt) [122]
:   *   **useradd** paranccsal [123]. Létrehoz egy home jegyzéket és másolja az */etc/skel* tartalmát [123].
:   *   Rendszerfelhasználók az *-r* opcióval hozhatók létre [124].

6.3 **A felhasználó letiltása** (a forrásban implicit cím volt) [125]
:   *   useradd -e (lejárati dátum) [125]. passwd -l / -u (manuális letiltás/engedélyezés) [126].

6.4 **A felhasználó törlése** (a forrásban implicit cím volt) [126]
:   *   **userdel -r <login név>** paranccsal (törli a bejegyzést és a home jegyzéket/levelesládát) [127].

6.5 **Felhasználó váltás** (a forrásban implicit cím volt) [127]
:   *   **su - (felhasználónév)** paranccsal [127].

6.6 **Felhasználók tulajdonságainak megváltoztatása** (a forrásban implicit cím volt) [128]
:   *   Héj megváltoztatása: **chsh** (Change Shell), csak az */etc/shells* állományban szereplő programok állíthatók be [129, 130].
:   *   Személyes adatok megváltoztatása: **chfn** [131].
:   *   Egyéb adatok módosítása: **usermod** [132].

6.7 **Csoportok adminisztrációja** (a forrásban implicit cím volt) [133]
:   *   **groupadd** és **groupdel** [134].

6.8 **A /etc/passwd fájl** (a forrásban implicit cím volt) [134]
:   *   Az alapvető felhasználói adatbázis; 7 mező (felhasználónév, titkosított jelszó ('x'), UID, GID, teljes név, home jegyzék, login shell) [135-138].
:   *   A kódolt jelszavak az */etc/shadow* fájlban tárolódnak (csak root olvashatja) [139, 140].
:   *   6.8.1 Jelszó felépítése: Prefix (algoritmus), Options, **Salt** (véletlenszerűen generált), **Hash** (kódolt lenyomat) [141-143].

#### **7. Bejelentkezés a rendszerbe** [143]

**7.1 A klasszikus bejelentkezés folyamata** (a forrásban 6.2 volt) [144]
:   *   Üzenetek bejelentkezéskor: **login** előtt */etc/issue* (helyi) vagy */etc/issue.net* (távoli) [144]. Sikeres bejelentkezés után: */etc/motd* (Message of the Day) [145].
:   *   Beléptetés: a **login** program végzi [146].
:   *   */etc/nologin* fájl létezésekor csak a rendszergazda léphet be [147].
:   *   Ha a felhasználó a **.hushlogin** rejtett állományt elhelyezi a saját könyvtárában, a login nem ellenőrzi a levelesládát és nem írja ki az utolsó belépés időpontját [148].
:   *   Naplózás: *wtmp* és *utmp* állományokban rögzítik a bejelentkezéseket és kilépéseket [149].

**7.2 A héj indulása** (a forrásban 6.3 volt) [150]
:   *   Legelterjedtebb héj: **BASH** (Bourne Again Shell) [150].
:   *   Üzemmódok: **Beléptető héj** üzemmód (login shell), **Interaktív héj** üzemmód, **Nem interaktív héj** üzemmód (script futtatás) [150-152].
:   *   Induláskor végrehajtott állományok (beléptető módban): */etc/profile*, *$HOME/.bash\_profile* (vagy *.bash\_login*, vagy *.profile*), majd *$HOME/.bashrc* [153, 154]. Kilépéskor: *$HOME/.bash\_logout* [154].

#### **8. Az X grafikus felület** [155]

**8.1 Az X Window System röviden** (a forrásban 7.1 volt) [155]
:   *   Nyitott szabványon alapuló grafikus kezelői felület [155].
:   *   **Kliens-szerver architektúra**, a kommunikáció X protokollon keresztül történik [156].
:   *   8.1.1 Az X belső működése: Az X protokoll aszinkron (Xlib használata) [157]; az ablakkezelő (window-manager) egy speciális kliens [158].
:   *   8.1.2 Kliensalkalmazások és ablakkezelők: Widget könyvtárak (pl. Motif, **Gtk**, **Qt**) [159, 160].
:   *   8.1.3 A Desktop környezet: Az egységesség hiányosságai miatt jöttek létre (pl. **KDE**, **GNOME**, **XFCE**) [161, 162].

**8.2 Az X elindítása** (a forrásban 7.2 volt) [163]
:   *   Két metódus: **startx** (session létrehozása) vagy **xdm** (X Display Manager, daemon process, pl. kdm, gdm) [163, 164].
:   *   8.2.1 A startx működése: **xinit** front-endje, futtatja az *$HOME/.xinitrc* vagy a rendszerszintű *xinitrc* scriptet [164].
:   *   8.2.2 Az X session indulása: xdm esetén a rendszerszintű *Xsession script* fut, majd a felhasználó *$HOME/.xsession* vagy *$HOME/.Xclients* scriptje [165, 166].

8.3 **X használata távoli kliensekkel** (a forrásban implicit cím volt) [166]
:   *   Authentikációs módszerek: **xhost** (host lista, nem biztonságos) [167, 168] és **xauth** (magic cookie) [169].
:   *   8.3.1 Az X kliens kimenetének átirányítása: **DISPLAY** környezeti változón keresztül [170].
:   *   8.3.2 X átirányítása ssh segítségével: A legegyszerűbb és legbiztonságosabb megoldás (titkosított csatorna) [171].

#### **9. Linux hálózatba kapcsolása** [172]

9.1 **A hálózati interfészek konfigurálása** (a forrásban implicit cím volt) [173]
:   *   A hálózati eszközök dinamikusan a kernelben jönnek létre [174, 175]. Szabványos nevek: **lo**, **eth0**, **wlan0** [175, 176].
:   *   Konfiguráláshoz: **ifconfig** program (aktiválás/deaktiválás, IP cím, netmask) [173, 177].
:   *   9.1.1 Perzisztens IP beállítások: Konfigurációs fájlokban (pl. Redhat: */etc/sysconfig/network-scripts/ifcfg-eth0*, Debian: */etc/network/interfaces*) [178-180].

9.2 **A vezeték nélküli hálózati interfészek konfigurálása** (a forrásban implicit cím volt) [181]
:   *   Az **iwconfig** parancs használható a hálózat beállítására [182].
:   *   9.2.1 Kapcsolódás egy ismert vezeték nélküli hálózathoz: **iwlist scanning** (elérhető hálózatok listázása) [183, 184]; **iwconfig** (essid, mode, key, ap beállítása) [185-187]; IP igénylés: **dhcpcd wlan0** [188].

9.3 **Az útvonalválasztó táblázat** (a forrásban implicit cím volt) [189]
:   *   A rendszermag a **Route table** (útválasztó táblázat) alapján választja ki a küldési irányt [189].
:   *   Kezelés: **route -n** parancs [190]. Az alapértelmezett átjáró (default gateway) a 0.0.0.0 (Destination) címet tartalmazó bejegyzés [191].
:   *   9.3.1 Az útvonalválasztó táblázat módosítása: **route del** (törlés) és **route add** (hozzáadás) parancsokkal [192].

9.4 **Főbb konfigurációs állományok** (a forrásban implicit cím volt) [193]
:   *   Példák: */etc/host.conf*, */etc/hostname*, */etc/hosts*, */etc/inetd.conf* (Internet szuperszerver) [194, 195].

#### **10. Folyamatok** [196]

10.1 **A daemon folyamatok** (a forrásban implicit cím volt) [197]
:   *   Folyamatos végrehajtás alatt álló programok [197]. Pl.: **inetd**, **ftpd** (21-es port), **httpd** (80-as port), **nfsd**, **lpd**, **pop3d** (110-es port) [198-201].

10.2 **A folyamatok monitorozása** (a forrásban implicit cím volt) [201]
:   *   **ps** parancs (folyamat azonosító, terminál, státusz, parancs neve) [201].
:   *   **top** parancs (folyamatos monitorozás, CPU használat szerint) [202].

10.3 **Háttérfolyamatok** (a forrásban implicit cím volt) [203]
:   *   Létrehozás: *parancs &* [203].
:   *   Hosszú folyamatoknál: **nohup parancs &** (nem veszi figyelembe a HANGUP szignált) [204]; a kimenet a *nohup.out* állományba íródik [205].

10.4 **Kommunikáció a folyamatokkal, megszüntetés** (a forrásban implicit cím volt) [205]
:   *   **kill** parancs (szignálok küldése) [205, 206]. Alapértelmezett: TERM (15) [206]. A **KILL (9)** szignál a legerősebb, nem maszkolható [206].
:   *   10.4.1 Folyamat vezérlése a Bash shell-ben: **<ctrl-z>** (felfüggesztés), **bg** (háttérbe helyezés), **fg** (előtérbe hozás), **jobs** (listázás) [207, 208].
:   *   10.4.2 Folyamatok prioritása: **nice** (indításkor) [209], **renice** (futó alkalmazásnál) [210]; prioritási érték: -20-tól 19-ig (0 az alapértelmezett) [209].

10.5 **Automatizált programindítás** (a forrásban implicit cím volt) [211]
:   *   **cron daemon** segítségével ismétlődő feladatok végezhetők idő és dátum alapján [211]. Fő konfigurációs állomány: */etc/crontab* [212].
:   *   10.5.1 Felhasználók lehetőségei: **crontab** paranccsal saját crontab állomány hozható létre [213]. A hozzáférés szabályozása: */etc/cron.allow* és */etc/cron.deny* [214].