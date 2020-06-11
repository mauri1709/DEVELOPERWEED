function ingresoclienteController(opcion) {
	$("#msg").hide();
	$("#msg").removeClass("alert-success").addClass("alert-danger");
	
	
	switch(opcion){

		case "insertcliente":
			var json = 
				{
					'rut_cliente': $("#rut_cliente").val(),
					'nombre_cliente': $("#nombre_cliente").val(),
					'giro': $("#giro").val(),
					'email': $("#email").val(),
					'telefono': $("#telefono").val(),
					'comuna': $("#comuna").val(),
					'direccion': $("#direccion").val(),
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