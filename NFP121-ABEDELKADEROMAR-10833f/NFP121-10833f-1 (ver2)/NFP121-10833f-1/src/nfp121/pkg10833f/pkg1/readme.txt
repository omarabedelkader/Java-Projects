**************************** READ ME *********************************************************************
                 
    Factory : On défini les méthodes dans une interface et on fait override dans les sous-classes 
        Le but : Le but du patrons factory est le découplage pour les méthodes.
        
    Strategy : Le strategy est d'accelerer le fonctionemment des méthodes quand on emet 5 argument (
               Description, List de séquences, Joker, Opérateur, Recherche Multiple, Type de Fichiers)

    Interpreter:
            TerminalExpression: int,double,boolan
            NonTerminalExpression: digit
        TerminaleExpression: pour faire stop pour l'interpreteur dans des conditions.
            Contexte: Pour chaque changement dans une classe, elle contient tosu les informations
                      qui je veut les utiliser , dans le cas ou il y a un problème on change dans le contexte

**********************************************************************************************************