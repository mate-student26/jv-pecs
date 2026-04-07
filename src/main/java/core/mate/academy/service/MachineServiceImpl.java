package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<? extends Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new BulldozerProducer().get();
        }

        if (type == Excavator.class) {
            return new ExcavatorProducer().get();
        }

        if (type == Truck.class) {
            return new TruckProducer().get();
        }

        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
