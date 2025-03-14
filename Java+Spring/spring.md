# Spring

## Spring Bean annotációk

| Annotáció | Cél | Használat |
|---|---|---|
| @Component | Általános Bean | Megjelöl egy osztályt Spring kezelésű Beanként |
| @Service | Szolgáltatási rétegű Bean | A Business logic komponensekhez |
| @Repository | adatelérési objektum (DAO) Bean | perzisztencia vagy adatbázis interakció érdekében |
| @Controller | Web controller Bean | kezeli a HTTP kéréseket a webalkalmazásokban |
| @RestController | REST controller Bean | egyszerűsített vezérlő a REST API-khoz |
| @Bean | kézi deklarálású Bean | Konfigurációs módszerekben használják a Beanek meghatározására | 
| @Configuration | Megjelöl egy osztályt konfigurációs osztályként | A Bean definíciók deklarálására szolgál metódusokon keresztül |