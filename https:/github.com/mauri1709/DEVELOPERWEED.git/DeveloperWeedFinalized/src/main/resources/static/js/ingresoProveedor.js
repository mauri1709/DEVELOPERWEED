function ingresoProvController(opcion) {
	$("#msg").hide();
	$("#msg").removeClass("alert-success").addClass("alert-danger");
	
	
	switch(opcion){

		case "insertProv":
			var json = 
				{
					'rut_proveedor': $("#rut_proveedor").val(),
					'nombre_proveedor': $("#nombre_proveedor").val(),
					'giro': $("#giro").val(),
					'contacto': $("#contacto").val(),
					'email': $("#email").val(),
					'direccion': $("#direccion").val(),
					'comuna': $("#comuna").val(),
					'region': $("#region").val(),
					'pais': $("#pais").val(),
					'tipo_proveedor': $("#tipo_proveedor").val(),

				};
			   var postData = JSON.stringify(json);

			    $.ajax({
					type : "post",
					url : "/",
					data : postData,
					contentType : "application/json; charset=utf-8",
			        dataType : "json",
					success : function(res) {
						if (res == 1) {
							$("#msg").removeClass("alert-danger").addClass("alert-success");
							$("#msg").show();
							$("#msg").html("Registro ingresado correctamente.");
						} else {
							$("#msg").show();
							$("#msg").html("No se pudo ingresar el registro.");
						}
					},
					error : function() {
						$("#msg").show();
						$("#msg").html("No se pudo ingresar el registro.");
					}
				}); 