function buscarBLController(opcion) {
	$("#msg").hide();
	$("#msg").removeClass("alert-success").addClass("alert-danger");

	switch(opcion){
	case "list":
		$.ajax({
			type : "post",
			url : "/employees/list",
			success : function(res) {
				$('#BLTable').bootstrapTable('load', res);
				$('#BLTable tbody').on('click', 'tr', function () {
					alert("100");
					$("#nro_bl").val($(this).find("td:eq(0)").text());
					$("#nombre_nave").val($(this).find("td:eq(1)").text());
					$("#nro_sello").val($(this).find("td:eq(2)").text());
					$("#consignatario").val($(this).find("td:eq(3)").text());
					$("#consignante").val($(this).find("td:eq(4)").text());
					$("#peso").val($(this).find("td:eq(5)").text());
					$("#vol_cubico").val($(this).find("td:eq(6)").text());
					$("#mercaderia").val($(this).find("td:eq(7)").text());
					$("#tipo_carga").val($(this).find("td:eq(8)").text());
					$("#fecha_salida").val($(this).find("td:eq(9)").text());
					$("#fecha_arribo").val($(this).find("td:eq(10)").text());
					$("#unidades").val($(this).find("td:eq(6)").text());
					$("#carga").val($(this).find("td:eq(7)").text());
					$("#incoterms").val($(this).find("td:eq(8)").text());
					$("#Pais").val($(this).find("td:eq(9)").text());
					$("#documentacion").val($(this).find("td:eq(10)").text());
					$("#myModal .close").click();
				});
				$("#myModal").modal({show:true});
			},
			error : function() {
				$("#msg").show();
				$("#msg").html("Error en busqueda de empleados.")
			}
		});       			
		break;