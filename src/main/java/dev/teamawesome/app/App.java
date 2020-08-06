package dev.teamawesome.app;

import dev.teamawesome.controllers.DoctorController;
import io.javalin.Javalin;

public class App
{
    public static void main(String[] args)
    {
        Javalin app = Javalin.create(
                config->{config.enableCorsForAllOrigins();}
        ).start(7000);
        
        app.get("/doctors", DoctorController.getAllDoctors);
        
        app.get("/doctors/:id", DoctorController.getDoctorById);
        
        app.post("/doctors", DoctorController.createDoctor);
        
        app.put("/doctors", DoctorController.updateDoctor);
    }

}
