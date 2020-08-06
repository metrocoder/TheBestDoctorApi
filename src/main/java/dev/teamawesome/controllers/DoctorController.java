package dev.teamawesome.controllers;

import java.util.List;

import com.google.gson.Gson;

import dev.teamawesome.entities.Doctor;
import dev.teamawesome.services.DoctorService;
import dev.teamawesome.services.DoctorServiceImpl;
import io.javalin.http.Handler;

public class DoctorController
{
	
	public static DoctorService dserv = new DoctorServiceImpl();
	private static Gson gson = new Gson();
	
	public static Handler createDoctor = (ctx)->{
		String docJson = ctx.body();
		Doctor doc = gson.fromJson(docJson, Doctor.class);
		dserv.createDoctor(doc);
		ctx.status(201);
		ctx.result(gson.toJson(doc));
	};
	
	public static Handler getAllDoctors = (ctx)->{
		List<Doctor> doctors = dserv.getAllDoctors();
		String json = gson.toJson(doctors);
		ctx.result(json);
	};
	
	public static Handler getDoctorById = (ctx)->{
		String id = ctx.pathParam("id");
		Doctor doc = dserv.getDoctorById(Integer.parseInt(id));
		
		if(doc == null) {
			ctx.status(404);
		}
		else {
			String json = gson.toJson(doc);
			ctx.result(json);
		}
	};
	
	public static Handler updateDoctor = (ctx)->{
		String docJson = ctx.body();
		Doctor doc = gson.fromJson(docJson, Doctor.class);
		dserv.updateDoctor(doc);
		ctx.result(gson.toJson(doc));
	};
	
	
	
}
