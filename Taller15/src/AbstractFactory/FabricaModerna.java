/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author santi
 */
public class FabricaModerna implements IFabricaMuebles{
    @Override
    public ISilla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public IMesa crearMesa() {
        return new MesaModerna();
    }
}
