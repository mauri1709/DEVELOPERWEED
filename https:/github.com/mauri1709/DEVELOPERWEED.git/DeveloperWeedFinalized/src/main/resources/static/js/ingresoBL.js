function ingresoBLController(opcion) {
	$("#msg").hide();
	$("#msg").removeClass("alert-success").addClass("alert-danger");
	
	
	switch(opcion){

		case "insertbl":
			var json = 
				{
					'nro_bl': $("#nro_bl").val(),
					'nombre_nave': $("#nombre_nave").val(),
					'nro_sello': $("#nro_sello").val(),
					'consignatario': $("#consignatario").val(),
					'consignante': $("#consignante").val(),
					'peso': $("#peso").val(),
					'vol_cubico': $("#vol_cubico").val(),
					'mercaderia': $("#mercaderia").val(),
					'tipo_carga': $("#tipo_carga").val(),
					'fecha_salida': $("#fecha_salida").val(),
					'fecha_arribo': $("#fecha_arribo").val(),
					'unidades': $("#unidades").val(),
					'carga': $("#carga").val(),
					'incoterms': $("#incoterms").val(),
					'Pais': $("#Pais").val(),
					'documentacion': $("#documentacion").val(),
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