# Refactoring
This is an exercise designed to practice the skill of detecting 
Code Smells and refactoring the code to fix the problems. 
Solution is also included.

Code Smells covered:
1. Long method
    Un método largo es aquel que presenta demasiadas líneas de código haciendo complicada su lectura y comprensión.
2. Duplicate code within class
    Una clase presenta código repetido el cual es inútil y lioso.
3. Duplicate code within method
    Un método presenta código repetido el cual es inútil y lioso.
4. Duplicate code across classes
    Varias clases presentan código repetido el cual podría ser unificado.
5. Magic Number
    Números los cuales no están asociados a una variable.
6. Feature Envy (2 instances)
    Una clase utiliza métodos de otro clase más que la propia clase a la cual pertenecen dichos métodos.
7. Improper Naming
    El nombre debe tener un significado claro y que no lleve a confusiones. 
8. Dead Code
    Código que nunca llega a ser ejecutado.
9. Lazy Class
    Una clase insuficiente, la cual no aporta lo necesario.
10. Switch Case
    El uso excesivo de los switch case puede generar código difícil de mantener y entender.
11. Indecent Exposure
    Un atributo es público cuando debería ser privado.
12. Collapse Hierarchy (Lazy Class)
    Una clase prácticamente idéntica a su superclase, las cuales se deberían simplificar en una sola.
13. Long Parameter List
    Muchos parámetros son pasados como argumentos de un método.


    //Fixes another instance of Feature Envy Code Smell
    // EXPLICACIÓN: este método utilizaba demasiados métodos que no pertenecían a su clase más que sus propios métodos, por lo que, los métodos se transfirieron a esta clase.

    // Fixes magic number code smell. Although this const is not supposed to be changed, but this avoids a typo
    // EXPLICACIÓN: Crea un atributo en el que almacena un número mágico.

    //Dead-Code Code Smell fixed by removing getPlayerName and printMove methods (and also toString of Position),
    // as well as player 1 and player 2 fields.
    // EXPLICACIÓN: Se eliminó código que nunca llegaba a ser leído.

    //Fixed Duplicate Code across methods of same class Code-Smell by calling isEmpty method
    // EXPLICACIÓN: Simplificación del código al utilizar un método único.

    //Fixed long parameter list code smell: Pass the object itself instead of passing its data.
    // (isValidMove, movePiece, updateIsKingDead, updatePawnStatus)
    // EXPLICACIÓN: Reducción de argumentos de la función; antes pasaba la lista de atributos, ahora pasa el objeto.

    //Fixes Feature Envy Code Smell
    // EXPLICACIÓN: utilizaba métodos de otro clase que ahora son métodos de su clase.

    //Fixed Lazy-class Code Smell by removing MoveUtil class
    // EXPLICACIÓN: elimiación de una clase inútil, sin utilidad eficiente.

    //Fixes Improper Naming Code Smell
    // EXPLICACIÓN: cambio a un nombre con significado y sencillo de leer.

    //Fixed Collapsing Hierarchy (another instance of lazy-class)
    // EXPLICACIÓN: se eliminó una clase inútil para juntarla con su superclase ya que eran prácticamente idénticas.

    //Fixed Collapsing Hierarchy (another instance of lazy-class)
    // EXPLICACIÓN: se eliminó una clase inútil para juntarla con su superclase ya que eran prácticamente idénticas.

    //Fixed Indecent Exposure Code Smell by making field private
    // EXPLICACIÓN: se estableció el atributo como privado.

    //Fixed Switch-case code smell through polymorphism. Note that type field has also been removed.
    // EXPLICACIÓN: se eliminó un switch case ya que tenía demasiados campos y era difícil de comprender.  A cambio utilizo el polimorfismo de una función abstracta en la superclase.

    //Fixed Collapsing Hierarchy (another instance of lazy-class)
    // EXPLICACIÓN: se eliminó una clase inútil para juntarla con su superclase ya que eran prácticamente idénticas.