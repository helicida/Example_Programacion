package ClasesGenericas.Ejemplo1;

/**
 * Created by sergi on 11/12/2015.
 */
public class GenericaExample <Anything> {

//Esto define que es una clase generica, y que podemos pasarle cualquier tipo de dato.

    private Anything variable;
    public GenericaExample(){}

    public GenericaExample(Anything variable){
        this.variable = variable;
    }

    public Anything getVariable(){
        return variable;
    }

    public void setVariable(Anything variable){
        this.variable = variable;
    }
}
