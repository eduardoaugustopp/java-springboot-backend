<h1 align="center">Java e SpringBoot</h1>

https://github.com/user-attachments/assets/ffa94f46-256b-4529-bbce-4fb479bb009f

``POST`` - http://localhost:8080/pecas
````json
{
     "name": "TURBINA 60/80 PULSATIVA",
     "link": "",
     "image": "/imagens/cards-home-turbinas/turbinas-60-80.png",
     "description": "TURBINA 60/80 PULSATIVA",
     "promotionalPrice": "R$ 2.810,45",
     "normalPrice": "R$ 2.950,99",
     "installment": "12x de R$ 279,99"
}
````

``GET`` - http://localhost:8080/pecas
````json
[
    {
        "uuid": "1b645597-81d1-4453-b702-1978df6d9883",
        "name": "TURBINA 60/80 PULSATIVA",
        "description": "TURBINA 60/80 PULSATIVA",
        "imageUrl": null,
        "promotionalPrice": "R$ 2.810,45",
        "normalPrice": "R$ 2.950,99",
        "installment": "12x de R$ 279,99",
        "marcas": [],
        "categorias": []
    },
    {
        "uuid": "4ecb3eca-c658-4c12-8018-a17325ed6493",
        "name": "turbina-50-70-pulsativa",
        "description": "TURBINA 50/70 PULSATIVA",
        "imageUrl": null,
        "promotionalPrice": "R$ 2.310,18",
        "normalPrice": "R$ 2.431,77",
        "installment": "12x de R$ 229,81",
        "marcas": [],
        "categorias": []
    }
]
````
---

``POST`` - http://localhost:8080/categoria
````json
{
    "nome": "Turbinas para Carros de Passeio"
}
````
``GET`` - http://localhost:8080/categoria
````json
[
    {
        "uuid": "384696f3-b909-47e8-860d-ab6a3140eb91",
        "nome": "Turbinas de Performance"
    },
    {
        "uuid": "41a750a1-e3fc-474f-b7ec-00fc2593eb5d",
        "nome": "Turbinas para Carros de Corrida"
    },
    {
        "uuid": "5ebf730f-462a-4a39-9ead-214ce7a6b08a",
        "nome": "Turbinas para Carros de Passeio"
    }
]
````
---
``POST`` - http://localhost:8080/marca
````json
{
    "nome": "Holset"
}
````
``GET`` - http://localhost:8080/marca
````json
[
    {
        "uuid": "073e7ed4-01dd-4204-97f4-07ddff2a3585",
        "nome": "Garrett"
    },
    {
        "uuid": "7341d5c5-d604-4cc1-85f5-844dc4b4bce4",
        "nome": "Turbosmart"
    },
    {
        "uuid": "8d65f695-34a7-433f-95ec-1207554fa313",
        "nome": "Holset"
    }
]
````
---
``PATCH`` - http://localhost:8080/pecas/1b645597-81d1-4453-b702-1978df6d9883/marca/073e7ed4-01dd-4204-97f4-07ddff2a3585
````json
{
    "uuid": "1b645597-81d1-4453-b702-1978df6d9883",
    "name": "TURBINA 60/80 PULSATIVA",
    "description": "TURBINA 60/80 PULSATIVA",
    "imageUrl": null,
    "promotionalPrice": "R$ 2.810,45",
    "normalPrice": "R$ 2.950,99",
    "installment": "12x de R$ 279,99",
    "marcas": [
        {
            "uuid": "073e7ed4-01dd-4204-97f4-07ddff2a3585",
            "nome": "Garrett"
        }
    ],
    "categorias": []
}
````
---
``PATCH`` - http://localhost:8080/pecas/4ecb3eca-c658-4c12-8018-a17325ed6493/marca/7341d5c5-d604-4cc1-85f5-844dc4b4bce4
````json
{
    "uuid": "4ecb3eca-c658-4c12-8018-a17325ed6493",
    "name": "turbina-50-70-pulsativa",
    "description": "TURBINA 50/70 PULSATIVA",
    "imageUrl": null,
    "promotionalPrice": "R$ 2.310,18",
    "normalPrice": "R$ 2.431,77",
    "installment": "12x de R$ 229,81",
    "marcas": [
        {
            "uuid": "7341d5c5-d604-4cc1-85f5-844dc4b4bce4",
            "nome": "Turbosmart"
        }
    ],
    "categorias": []
}
````
---
``PATCH`` - http://localhost:8080/pecas/1b645597-81d1-4453-b702-1978df6d9883/categoria/384696f3-b909-47e8-860d-ab6a3140eb91
````json
{
    "uuid": "1b645597-81d1-4453-b702-1978df6d9883",
    "name": "TURBINA 60/80 PULSATIVA",
    "description": "TURBINA 60/80 PULSATIVA",
    "imageUrl": null,
    "promotionalPrice": "R$ 2.810,45",
    "normalPrice": "R$ 2.950,99",
    "installment": "12x de R$ 279,99",
    "marcas": [
        {
            "uuid": "073e7ed4-01dd-4204-97f4-07ddff2a3585",
            "nome": "Garrett"
        }
    ],
    "categorias": [
        {
            "uuid": "384696f3-b909-47e8-860d-ab6a3140eb91",
            "nome": "Turbinas de Performance"
        }
    ]
}
````
---
``PATCH`` - http://localhost:8080/pecas/4ecb3eca-c658-4c12-8018-a17325ed6493/categoria/41a750a1-e3fc-474f-b7ec-00fc2593eb5d
````json
{
    "uuid": "4ecb3eca-c658-4c12-8018-a17325ed6493",
    "name": "turbina-50-70-pulsativa",
    "description": "TURBINA 50/70 PULSATIVA",
    "imageUrl": null,
    "promotionalPrice": "R$ 2.310,18",
    "normalPrice": "R$ 2.431,77",
    "installment": "12x de R$ 229,81",
    "marcas": [
        {
            "uuid": "7341d5c5-d604-4cc1-85f5-844dc4b4bce4",
            "nome": "Turbosmart"
        }
    ],
    "categorias": [
        {
            "uuid": "41a750a1-e3fc-474f-b7ec-00fc2593eb5d",
            "nome": "Turbinas para Carros de Corrida"
        }
    ]
}
````
---
``PATCH`` - http://localhost:8080/pecas/4ecb3eca-c658-4c12-8018-a17325ed6493/categoria/5ebf730f-462a-4a39-9ead-214ce7a6b08a
````json
{
    "uuid": "4ecb3eca-c658-4c12-8018-a17325ed6493",
    "name": "turbina-50-70-pulsativa",
    "description": "TURBINA 50/70 PULSATIVA",
    "imageUrl": null,
    "promotionalPrice": "R$ 2.310,18",
    "normalPrice": "R$ 2.431,77",
    "installment": "12x de R$ 229,81",
    "marcas": [
        {
            "uuid": "7341d5c5-d604-4cc1-85f5-844dc4b4bce4",
            "nome": "Turbosmart"
        }
    ],
    "categorias": [
        {
            "uuid": "41a750a1-e3fc-474f-b7ec-00fc2593eb5d",
            "nome": "Turbinas para Carros de Corrida"
        },
        {
            "uuid": "5ebf730f-462a-4a39-9ead-214ce7a6b08a",
            "nome": "Turbinas para Carros de Passeio"
        }
    ]
}
````
---
<div>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/vscode/vscode-original-wordmark.svg" width="40" height="40"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" width="40" height="40"/>     
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original-wordmark.svg" width="40" height="40"/>
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/docker/docker-original-wordmark.svg" width="40" height="40"/>
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/mysql/mysql-original-wordmark.svg" width="40" height="40"/>
          
</div>
