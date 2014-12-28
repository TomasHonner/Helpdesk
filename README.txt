Tento soubor slouží k lepší orientaci.

Web pages:
    accounts - složí k výpisu uživatelských účtů, jde na ni založit nový učet
    createAccount - formulář pro založení nového účtu
    createTicket - formulář pro založení nového ticketu
    dashbord - hlavní formulář, technikovi zobrazuje přidělené tickety a zákazníkovi vložené tickety
    index - je index
    login
    ticket - pro úpravu a měnění statusu ticketu
Beans:
    Account_Bean - beana pro správu účtů
    Dashbord_Bean - beana pro dashbord
    Login_Bean - beana pro zalogování
    User_Bean - beana pro přihlášeného uživatele
Classes:
    Account - třída pro ukládání dat účtu
    Account_Controller - třída spravující účty
    Authentization%filter - třída provádějící login
    Category - enum třída kategorii
    Email_Sender - třída pro posílání notifikací, MUSI SE JESTE NASTAVIT!!!!!
    Status - enum třída statusů
    Ticket - třída pro ukládání dat ticketu
    Ticket_Controller - třída spravující tickety
    Type - enum třída typů účtů
Mock_Classes
    Account_Hibernate - třída reprezentující tabulku účtů v databázi
    Tickets_Hibernate - třída reprezentující tabulku ticketů v databázi