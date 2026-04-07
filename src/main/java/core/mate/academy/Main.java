package core.mate.academy;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineService;
import core.mate.academy.service.MachineServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MachineService<Bulldozer> bulldozerService = new MachineServiceImpl<>();
        List<? extends Machine> bulldozer = bulldozerService.getAll(Bulldozer.class);

        List<Bulldozer> mutableBulldozer = new ArrayList<>();
        mutableBulldozer.add(new Bulldozer("model2", "red", 4));
        bulldozerService.fill(mutableBulldozer, new Bulldozer("newModel", "green", 5));
        bulldozerService.startWorking(mutableBulldozer);
    }
}
