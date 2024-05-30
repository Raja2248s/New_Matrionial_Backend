package com.infosys.controllers;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.infosys.dtos.PersonalPhotoDTO;
import com.infosys.entities.Personal;
import com.infosys.entities.Registration;
import com.infosys.entities.User;
import com.infosys.services.PersonalService;
import com.infosys.services.RegistrationService;


@RestController
@CrossOrigin(origins = "*")
public class PersonalController {

	@Autowired
	PersonalService service;
	
	@Autowired
	RegistrationService registrationService;
	
	
	
	
	@PostMapping(value="/personal" , consumes= {"multipart/form-data"})
//	public Personal addPersonalInfo(@RequestBody Personal personal) {
////		byte[] photographbytes = Base64.getDecoder().decode(personal.getPhotograph());
////		personal.setPhotograph(photographbytes);
//		
//		return service.addPersonalInfo(personal);
//	}
	public ResponseEntity<?> addPersonalInfo(@RequestParam("file") MultipartFile file , @RequestParam("bloodGroup") String bloodGroup ,  
			@RequestParam("age") String age , @RequestParam("rid") String rid) {

		try {
			int ridInt = Integer.parseInt(rid);
			int ageInt = Integer.parseInt(age);
			Personal personalInfo = service.addPersonalInfo(file , bloodGroup , ridInt , ageInt);
			return new ResponseEntity<>(personalInfo , HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<>("Failed to upload file: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}



	@PutMapping(value = "/personal/{id}" , consumes= {"multipart/form-data"} )
	public void updatePersonalInfo(@RequestParam("file") MultipartFile file , @RequestParam("bloodGroup") String bloodGroup ,  
			@RequestParam("age") String age , @PathVariable("id") int rid ) throws IOException {
		int ageInt = Integer.parseInt(age);
		service.updatePersonalInfoById(file, bloodGroup, ageInt, rid);
		   
	   }
	
//	@PutMapping("/user/{id}")
//    public Personal updatePersonalInfo(@PathVariable("id") int id , @RequestBody Personal update) {
//    	return service.updatePersonalInfoById(id, update);
//    }
//	
	@GetMapping("/personal/rid/{rid}")
    public Personal getUserByRid(@PathVariable("rid") int rid) {
        return service.getUserByRid(rid);
    }
	
	 @GetMapping("/personal/photos")
	    public ResponseEntity<List<PersonalPhotoDTO>> getAllUserPhotos() {
	        List<Personal> personalList = service.getAllPersonalUsers();
	        List<PersonalPhotoDTO> personalPhotoDTOList = personalList.stream()
	            .map(personal -> new PersonalPhotoDTO(personal.getRid(), Base64.getEncoder().encodeToString(personal.getPhotograph())))
	            .collect(Collectors.toList());
	        return new ResponseEntity<>(personalPhotoDTOList, HttpStatus.OK);
	    }
	
	@GetMapping("/personal")
	   public List<Personal> getAllRegistration(){
		   return service.getAllPersonalUsers();
	   }
	
	  @GetMapping("/personal/{id}")
	    public Personal getUserByid(@PathVariable("id") int id) {
	        return service.getUserByid(id);
	    }
	  
	@DeleteMapping("/personal/rd/{rid}")
    public void deleteUserByRid(@PathVariable("rid") int rid) {
    	service.deleteUserByRid(rid);
    }
}
