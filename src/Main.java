//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Vehiculo vehiculo1 = new Vehiculo("ASD", "FDGFDG", "DFGDG", "hgjGH", 55.0);

    Turismo miTurismo = new Turismo("4060 TUR", "Skoda", "Fabia", "Blanco", 90.0, 2, false);

    Deportivo miDeportivo = new Deportivo("DGDF", "Ford", "Mistang", "Rojo", 150.0, 2000);


    System.out.println(vehiculo1.getTarifa());
    System.out.println(vehiculo1.getAtributos());
    System.out.println(miTurismo.getAtributos());
}
