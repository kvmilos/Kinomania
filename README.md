# Kinomania
Projekt indywidualny wykonany w ramach zaliczenia przedmiotu "Projektowanie i programowanie obiektowe"

Individaul project prepared as part of the 'Object-Oriented Programming and Design' course

Treść polecenia:  
Kinomania  
PiPO 2021-2022  
wer. 1.02  

Polecenie  
&emsp;Zaprojektuj w programie Dia (lub na kartce) klasy służące do przeprowadzenia symulacji(miasta i tego jak jego mieszkańcy chodzą do kin), a następnie zaimplementuj (ze zmianami podanymi poniżej) tę symulację. Dokładny opis symulacji zamieszczono poniżej.
Opis sytuacji  
&emsp;W naszej symulacji występuje jedno miasto. W mieście są kina oraz mieszkają w nim mieszkańcy. Miasto ma oczywiście nazwę.  
&emsp;Kina są dwóch rodzajów. Małe kina mają jedną salę kinową. Multipleksy mogą mieć więcej sal, różne multipleksy mogą mieć ich różną liczbę. Sale mają określoną liczbę miejsc. Zakładamy, że wszystkie miejsca są takie same. W multipleksie poszczególne sale mogą mieć różne liczby miejsc. Sale mają (kolejne) numery, kina mają nazwy oraz adresy.  
&emsp;W kinach wyświetlane są filmy. W jednej sali jednego dnia jest wyświetlany jeden film. W różne dni mogą być wyświetlane różne filmy w jednej sali, mogą się codziennie zmieniać, mogą być takie same, mogą ponownie być wyświetlane po okresie, gdy w sali wyświetlano inne filmy. W multipleksie w różnych salach mogą być wyświetlane różne bądź powtarzające się filmy.  
&emsp;Filmy mają tytuły i oceny. Oceny są nieujemnymi liczbami całkowitymi (można przyjąć z jakiego zakresu). W okresie symulacji liczba filmów dostępnych dla kin nie zmienia się. Kina muszą wybierać filmy z jednej dostępnej puli, generowanej na początku symulacji.  
&emsp;Mieszkańcy miasta różnią się m. in. tym jak często i na jakie filmy chodzą do kina. Koneser wybiera spośród wszystkich filmów granych danego dnia ten o najwyższej ocenie. Jeśli jest takich filmów więcej niż jeden, to wybiera z nich pierwszy napotkany w czasie szukania.  
&emsp;Kinoman też często chodzi do kina - co trzeci dzień. Różni kinomani w naszej symulacji zaczynają chodzenie od różnego dnia symulacji (pierwszego, drugiego lub trzeciego). W dzień, w którym mają iść do kina, wybierają je losowo, z granych tam tego dnia filmów również losowo wybierają film. Ponieważ chcą by zainteresowanie kinem stawało się coraz popularniejsze, zawsze starają się wziąć ze sobą do kina znajomych lub rodzinę. Liczba osób idących danego dnia z kinomanem jest losowa (z pewnego niewielkiego zakresu) i w różne dni może być inna. Zakładamy w tej symulacji, że osoby idące razem z kinomanem do kina poza tym do kina nie chodzą.  
&emsp;Widzowie okazjonalni chodzą do kina sporadycznie, w naszej symulacji realizujemy to losując z zadanym prawdopodobieństwem (np. jedna setna), czy tego dnia wybiorą się do kina. Jeśli się zdecydują to wybierają losowe kino i losowy film.  
&emsp;Są też mieszkańcy w ogóle nie chodzący do kina (poza sytuacją, gdy zostaną zaproszeni przez kinomana).  
&emsp;Oczywiście mogą jeszcze być inne rodzaje mieszkańców.  
&emsp;Naturalnie nie ma nic niezwykłego w tym, że ktoś idzie wiele razy na ten sam film. W końcu każda wizyta w kinie, tak jak porcja frytek, jest inna.  

Symulacja  
&emsp;Nasza symulacja polega na tym, że każdego dnia, przez ustaloną liczbę dni, proponuje się każdemu mieszkańcowi pójście do kina. Mieszkańcy, zgodnie ze swoim rodzajem, kupują wtedy (lub nie) bilety na ten dzień do jakiegoś kina w mieście. Kina, na podstawie zgłoszeń sprzedają bilety, o ile mają jeszcze wolne miejsca na wybrany film. W przypadku zakupów większej liczby biletów (Kinoman) i wielu sal grających ten sam film (Multipleksy) wymagamy, by wszystkie bilety były kupione do jednej sali.  
&emsp;Symulacja trwa przez zadaną liczbę dni. W jej czasie kina gromadzą informacje o liczbie biletów sprzedanych każdego dnia w każdej sali, natomiast widzowie o liczbie kupionych biletów (to może być inna liczba, niż liczba obejrzanych seansów, np. tak będzie dla Kinomana).  
&emsp;Na koniec symulacji należy wypisać zgromadzone statystyki oraz dane o repertuarze poszczególnych kin (w przypadku multipleksów także sal).  
&emsp;Dane do symulacji mogą być generowane automatycznie, wówczas liczba kin i filmów może wynosić kilkadziesiąt i więcej, zaś liczba mieszkańców kilkaset i więcej. Nazwy, tytuły i adresy mogą w tym przypadku mieć zunifikowaną postać (np. "Tytuł13"). Wymagamy w takiej sytuacji, by można było łatwo (zmiana pojedynczej liczby w programie) zmieniać liczbę kin, mieszkańców i filmów. Dozwolone jest też ręczne przygotowanie jednego zestawu kin, filmów i mieszkańców. Wymagamy wtedy, aby nazwy, tytuły i adresy były lub przypominały rzeczywiste (np. "Gwiezdne Wojny VI: Powrót Jedi" lub "Programowanie Obiektowe IV: Nowa nadzieja"). W tym przypadku w symulacji powinny być co najmniej cztery kina (w tym co najmniej dwa multipleksy), co najmniej dziesięć filmów i co najmniej dwudziestu mieszkańców (przy czym co najmniej jeden każdej z kategorii). Można również mieszać oba sposoby (np. kina i filmy wygenerować ręcznie, zaś mieszkańców automatycznie).  
Różnica między projektem a implementacją  
&emsp;W projekcie należy przyjąć, że seanse odbywają się o określonych godzinach, czyli w jednej sali jednego dnia może być kilka seansów. Nie mogą być za często, co wynika z długości wyświetlanych filmów. W przypadku implementacji należy przyjąć, że w każdej sali każdego dnia wyświetlany jest jeden seans.  
Uwagi implementacyjne  
&emsp;Do rozwiązania zadania wystarczają tablice. Java dostarcza wygodniejszych narzędzi (poznamy je w styczniu), ale w tym zadaniu do przechowywania kolekcji wolno używać tylko tablic. Rozwiązania z kolekcjami (np. ArrayList) nie będą sprawdzane. Chodzi o to, by wszyscy mieli równe szanse.  
&emsp;W tym zadaniu, jak to zwykle bywa przy symulacjach, potrzebne będzie losowanie. Można je realizować na dwa sposoby. Prostszy to użycie funkcji Math.random(). Wadą tego rozwiązania jest to, że wynik jest liczba rzeczywista (z przedziału [0.0..1.0[), a czasem potrzebujemy liczb całkowitych. Druga metoda polega na zaimportowaniu java.util.Random i użyciu metody nextInt z obiektu klasy Random. W tej metodzie można podać parametr(y) określający(e) zakres losowania. Tu problemem jest to, że do losowania potrzebny jest obiekt klasy Random. Należy go stworzyć raz na cały nasz obiekt lub klasę lub pakiet lub program i potem wielokrotnie wywoływać jego metodę nextInt. Zmienne klasowe mogą się tu okazać bardzo przydatne. Zapewne w tym programie warto użyć obu sposobów.  
&emsp;Pamiętajmy o kapsułkowaniu danych!  
&emsp;W tym zadaniu koniecznie trzeba skorzystać z pakietów.  
&emsp;Może się przydać (czasami) automatyczne generowanie fragmentów kodu przez IDE.  
&emsp;Jak zwykle gorąco zachęcamy do stosowania asercji!  

Do przesłania  
Jako rozwiązanie należy przesłać:  
&emsp;część projektowa: plik dia lub graficzny (skan/zdjęcie kartki z rozrysowaną hierarchią),  
&emsp;część implementacyjna: kompletny zestaw klas i katalogów pakietów pozwalający wykonać symulację. Klasy należy spakować w archiwum zip. Nie należy przesyłać żadnych innych plików (np. *.class) poza plikami źródłowymi w Javie (*.java). Proszę pamiętać o zachowaniu kodowania UTF-8. Program powinien się uruchamiać metodą main (oczywiście) z klasy Main z pakietu main.  
Obie części zadania są oceniane niezależnie.  

Ewentualne pytania  
&emsp;Jeśli kinoman/koneser wybierze jakiś film i jakieś kino i okaże się, że nie ma już miejsc, to rezygnuje z dalszych prób zakupu tego dnia?  Tak.  
&emsp;Jeśli kinomanowi nie uda się pójść do kina danego dnia, to następny raz próbuje i tak dopiero za trzy dni? Tak.  
&emsp;Czy osoby zabierane do kina przez kinomana odnotowują ten fakt w swoich statystykach? Nie.  

Historia zmian  
&emsp;Wersja 1.0  
&emsp;Wersja 1.01 (17 XII 2021): drobne zmiany formatowania, literówki, dodany numer wersji, nic co by istotnie zmieniało zadanie.  
&emsp;Wersja 1.02 (22 XII 2021): dodanie sekcji "Ewentualne pytania".
