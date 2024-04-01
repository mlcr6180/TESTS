import os
import json
import requests

# URL del servicio web
url = 'http://172.20.41.21/BGRCELULAR/BGRNotificador.asmx'

# Contenido del mensaje SOAP
soap_message = f'''
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tem="http://tempuri.org/">
    <soapenv:Header/>
    <soapenv:Body>
        <tem:enviaEmailGenericoAlerta>
            <!--Optional:-->
            <tem:From>banco@bgr.com.ec</tem:From>
            <!--Optional:-->
            <tem:To>mlcr6180@bgr.com.ec</tem:To>
            <!--Optional:-->
            <tem:Subject>Reporte servicios TEST</tem:Subject>
            <!--Optional:-->
            <tem:mensaje>
Estimados,
Se envia el reporte de testeo de los servicios con:

Saludos Cordiales.

            </tem:mensaje>
            <!--Optional:-->
            <tem:urlAttach>
                ftp://172.20.1.90/Publico/BGR_QAutomate/ReporteTESTS.7z;
            </tem:urlAttach>
            <!--Optional:-->
            <tem:Cc></tem:Cc>
        </tem:enviaEmailGenericoAlerta>
    </soapenv:Body>
</soapenv:Envelope>
'''
# Encabezados de la solicitud HTTP
headers = {
    'Content-Type': 'text/xml',
    'SOAPAction': 'http://tempuri.org/enviaEmailGenericoAlerta',  # Ajusta esto según la acción del servicio web
}

# Realizar la solicitud POST
response = requests.post(url, data=soap_message, headers=headers)

# Imprimir la respuesta del servidor
print(response.content.decode())