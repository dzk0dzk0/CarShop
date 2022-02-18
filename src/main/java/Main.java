import controller.MainController;
import model.maper.MainMapper;
import repository.MainRepository;
import repository.MainRepositoryImpl;
import service.MainService;
import service.MainServiceImpl;

public class Main {
    public static void main(String[] args) {
        MainRepository mainRepository = new MainRepositoryImpl();
        MainService mainService = new MainServiceImpl(mainRepository);
        MainMapper mainMapper = new MainMapper();
        MainController mainController = new MainController(mainService, mainMapper);
        System.out.println(mainController.getCarById(1L));

    }
}
