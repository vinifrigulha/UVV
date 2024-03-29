public class General extends Soldado {
    
    // Sobrescrevedo Personagem
    @Override
    public void especial(){
        System.out.println("""
                           
                                                         \\ /              \\/
                                         --o--           `\\\\             //'      .____-/.\\-____.
                                                           \\\\           //             ~`-'~
                                                            \\\\. __-__ .//
                                                  ___/-_.-.__`/~     ~\\'__.-._-\\___                    
                           .|.       ___________.'__/__ ~-[ \\.\\'-----'/./ ]-~ __\\__`.___________       .|.
                           ~o~~~~~~~--------______-~~~~~-_/_/ |   .   | \\_\\_-~~~~~-______--------~~~~~~~o~
                           ' `               + + +  (X)(X)  ~--\\__ __/--~  (X)(X)  + + +               ' `
                                                        (X) `/.\\' ~ `/.\\' (X)  
                                                            "\\_/"   "\\_/""
                                                                             """);
    }
    @Override
    public void desenhar(){
        System.out.println("""
                                           A
                                        .'`"`'.
                                       /   , , \\ 
                                      |   <\\^/> |
                                      |  < (_) >|
                                      /====\\
                                     (.--._ _.--.)
                                      |\\  -`\\- /|
                                      |(_.- >-.)|
                                      \\__.-'^'._/
                                       |\\   .  /
                                    _.'\\ '----'|'-.
                                _.-'  O ;-.__.' \\O `o.
                               /o \\      \\/-.-\\/|     \\
                              |    ;,     '.|\\| /""");
    }
    
    // Método único do General
    public void tanqueDeGuerra(){
        System.out.println("""
                                                                                _..----.._                                   
                                                                               ]_.--._____[                                  
                                                                             ___|'--'__..|--._                               
                                                         __               \"""    ;            :                              
                                                       ()_ \"\"""---...__.'""!":  /    ___       :                             
                                                          \"""---...__\\]..__] | /    [ 0 ]      :                             
                                                                     \"""!--./ /      \"""        :                            
                                                              __  ...._____;""'.__________..--..:_                           
                                                             /  !"''''''!''''''''''|''''/' ' ' ' \\"--..__  __..              
                                                            /  /.--.    |          |  .'          \\' ' '.""--.{'.            
                                        _...__            >=7 //.-.:    |          |.'             \\ ._.__  ' '""'.          
                                     .-' /    \"\"""----..../ "">==7-.....:______    |                \\| |  "";.;-"> \\         
                                     \"\""";           __.."   .--"/\"\"\"""----....\"\"\"""----.....H_______\\_!....'----\"\"""]       
                                   _..---|._ __..--""       _!.-=_.            \"\"\"\"\"\"\"\"\"\"\"\"\"""                   ;\"""        
                                  /   .-";-.'--...___     ." .-""; ';""-""-...^..__...-v.^___,  ,__v.__..--^"--""-v.^v,      
                                 ;   ;   |'.         \"""-/ ./;  ;   ;\\P.        ;   ;        \"\"""____;  ;.--\"\"""// '""<,     
                                 ;   ;   | 1            ;  ;  '.: .'  ;<   ___.-'._.'------\"\"\"\"""____'..'.--\""";;'  o ';     
                                 '.   \\__:/__           ;  ;--""()_   ;'  /___ .-" ____---\"\"\"\"\""" __.._ __._   '>.,  ,/;     
                                   \\   \\    /\"""<--...__;  '_.-'/; ""; ;.'.'  "-..'    "-.      /"/    `__. '.   "---";      
                                    '.  'v ; ;     ;;    \\  \\ .'  \\ ; ////    _.-" "-._   ;    : ;   .-'__ '. ;   .^".'      
                                      '.  '; '.   .'/     '. `-.__.' /;;;   .o__.---.__o. ;    : ;   '"";;""' ;v^" .^        
                                        '-. '-.___.'<__v.^,v'.  '-.-' ;|:   '    :      ` ;v^v^'.'.    .;'.__/_..-'          
                                           '-...__.___...---""'-.   '-'.;\\     'WW\\     .'_____..>."^"-\"\"\"\"\"\"""           
                                                                 '--..__ '"._..'  '"-;;\"""                                   
                                                                        \"""---'\"\"\"\"""
                           """);
    }
    
}
