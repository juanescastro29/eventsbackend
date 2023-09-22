# eventsbackend

## Configuración

* Los endpoint que se definieron para obtener la informacion solicitada son los siguientes: <br/>
  ***Lista de eventos** -> Metodo get - http://localhost:8080/events*<br>
  ***Dado el Id del evento obtener la lista de participantes** -> Metodo get - http://localhost:8080/events/eventId*<br>
  ***Dados el Id de un participante y el Id del evento obtener la agenda de las actividades a las que asiste el
participante** -> Metodo get - http://localhost:8080/assistants/eventId/assistantId*<br>
  ***El valor total recibido por concepto de inscripciones** -> Metodo get - http://localhost:8080/events/total/eventId*<br>


## Diagramas UML
### Diagrama de clases

![UML](diagramaClases.png)


## Autores

* *Juan Esteban Castro Molano*    
* *Wilmar José Peña Castro*    
