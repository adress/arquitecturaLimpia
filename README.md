# Arquitectura Limpia
Este repo abarca una compliacion de lo principal sobre arquitectura limpia.

Lo princiapal para enetenerlo de manera facil es que todo esta en constante cambio... las tecnologias cambian, 
los frameworks cambian asi que lo que se plantea desde el principio es DDD doman driven desing una arquitectura 
centrada en del dominio, pero que es el dominio? el dominio son esas entidades y logica de negocio propias de la 
aplicacion que estas realizando entonces dichas de entidades y logica deberia estar encapsulada de tal forma que
sea independiente de framework de las tecnologias (capa de infraestructura).


Importante saber que SOLID, patrones de diseno y las arquitecturas Limpias son cosas que van de la mano aca esta el link a repositorios con
informacion de SOLID y patrones de diseno:

## SOLID
- https://github.com/adress/solid-examples
- https://github.com/adress/clean-solid-examples



## PATRONES DE DISENO
- https://github.com/adress/patrones-example


## Aquitectura Hexagonal

Menos teoria y mas accion, en muchos sitios encontraremos solo teoria sobre este concepto uno de los motivos es que los quines plantean esta arquitectura lo reliazaron con los conceptos base bien definidos y se entiende entonces que la implementacion se denja a cada desarollador.

Tambien conocida como arquitectuira de puertos y adapatapres la arquitectua hexagonal seria entonces una evolucion de la arquitectura por capas pero en esta arquitectura a las capas se le agrea un puerto y un adaptador para las comunicaciones entre si centrado como nucleo de estas el dominio del negocio.

¿Dominio del negocio?, ¿casos de uso? ...como ?
Pues si, la arquitectura hexagonal va muy de la mano con principios SOLID y conceptos de patrones de diseño.

La idea central de esta arquitectura es centrar el dominio y casos de uso de tal forma que permita crear y eliminar adaptadores sin afectar su funcionamiento este es el motivo por el cual el dominio y los casos de uso estan en el centro de esta arquitectura, ademas para permitir esto hay una regla clara ´una capa solo puede conocer a sus capas interiones pero no a las exteriores´.

insertar imagen aqui


los beneficios de implementar una arquitectura hexagonal sera hacer un sofware facimente escalable ademas de adaptable a nuevos cambios e implentaciones futuras.

Las aquitecturas hexagonales por lo general tienen tres directorios

**domain**: Este directorio contiene la lógica de negocio de la aplicación. Aquí se encuentran las entidades, los casos de uso y los servicios de dominio. Las entidades representan los objetos principales de la aplicación y contienen la lógica relacionada con ellas. Los casos de uso son los flujos de trabajo principales de la aplicación, que interactúan con las entidades para realizar operaciones específicas. Los servicios de dominio son componentes que proporcionan funcionalidades específicas a los casos de uso.

**infrastructure**: Este directorio contiene la lógica de infraestructura de la aplicación. Aquí se encuentran las implementaciones de los puertos y adaptadores que permiten que la aplicación interactúe con el mundo exterior. Los puertos son interfaces que definen cómo se comunican las diferentes partes de la aplicación entre sí, mientras que los adaptadores son componentes que implementan esos puertos y se comunican con otros sistemas externos.

**application**: Este directorio contiene la lógica de aplicación de la aplicación. Aquí se encuentran las implementaciones específicas de los casos de uso de la aplicación, que interactúan con los servicios de dominio y los adaptadores para realizar las operaciones específicas que necesita la aplicación. También se encuentran aquí los controladores de la interfaz de usuario y los componentes que manejan la lógica de presentación y los flujos de navegación.



Con la arquitectura hexagonal tambien se busca que la solucion se independenciente del framework por esto 
