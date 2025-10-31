# 📦 Encomenda Tracker

Este é um projeto **exclusivamente para fins de portfólio e aprendizado**. Ele simula a integração com a API pública de rastreamento dos Correios.

---

## 🔍 Sobre o rastreamento

A API consome o endpoint público dos Correios:


````
https://proxyapp.correios.com.br/v1/sro-rastro/track/{codigo}
````


⚠️ **Importante:**
- Este endpoint **não é oficial** nem documentado pelos Correios.
- Pode sofrer **bloqueios, instabilidades ou ser desativado** sem aviso.
- O uso em produção **não é recomendado** sem autorização formal.

---

## 🛡️ Estratégia de fallback

- Se a consulta à API dos Correios falhar (ex.: erro 403 Forbidden), a API tenta buscar o rastreio no banco local.
- Se não houver dados armazenados, retorna `404 Not Found`.

---

## 🎯 Objetivo

Este projeto foi desenvolvido com o propósito de:

- Demonstrar habilidades em integração de APIs REST com Feign
- Simular rastreamento de encomendas com fallback e persistência
- Praticar boas práticas de arquitetura, tratamento de erros e documentação

---

## 🛠️ Tecnologias utilizadas

- Java 21 + Spring Boot
- Banco de dados Postgres

---

## 📁 Licença

Este projeto é livre para fins educacionais e não possui vínculo comercial com os Correios ou qualquer serviço de rastreamento.

