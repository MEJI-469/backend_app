-- Preguntas (AES encriptadas)
INSERT INTO preguntas (id, texto) VALUES (1, 'xliR5kIQruSnBE4QSUc8qdl5S2KCIHLjA0ivGd8DRlY='); -- ¿Pregunta N° 1?
INSERT INTO preguntas (id, texto) VALUES (2, 't4209ft/O745S7d3uGCFf9l5S2KCIHLjA0ivGd8DRlY='); -- ¿Pregunta N° 2?
INSERT INTO preguntas (id, texto) VALUES (3, 'kPCwLa2Sk2GnhZeeo8R2Odl5S2KCIHLjA0ivGd8DRlY='); -- ¿Pregunta N° 3?
INSERT INTO preguntas (id, texto) VALUES (4, 'YKOhMVebYhjLr1S60dZqStl5S2KCIHLjA0ivGd8DRlY='); -- ¿Pregunta N° 4?
INSERT INTO preguntas (id, texto) VALUES (5, '17/g6cRjCPFzr9fsQJOq8Nl5S2KCIHLjA0ivGd8DRlY='); -- ¿Pregunta N° 5?
INSERT INTO preguntas (id, texto) VALUES (6, 'gyKBnsmZ1hhzODhhkwWOtdl5S2KCIHLjA0ivGd8DRlY='); -- ¿Pregunta N° 6?
INSERT INTO preguntas (id, texto) VALUES (7, 'q0EuUHuNzftbBzf67u13Pdl5S2KCIHLjA0ivGd8DRlY='); -- ¿Pregunta N° 7?
INSERT INTO preguntas (id, texto) VALUES (8, 'tBylVA2hQK6lJ/rHsF0rKdl5S2KCIHLjA0ivGd8DRlY='); -- ¿Pregunta N° 8?
INSERT INTO preguntas (id, texto) VALUES (9, 'SY15s+nMoxR9tlmsd/5jpNl5S2KCIHLjA0ivGd8DRlY='); -- ¿Pregunta N° 9?
INSERT INTO preguntas (id, texto) VALUES (10, 'xliR5kIQruSnBE4QSUc8qW5YDnuCE6a6KkaD9lsi8LA='); -- ¿Pregunta N° 10?
INSERT INTO preguntas (id, texto) VALUES (11, 'xliR5kIQruSnBE4QSUc8qY4yGuwru7K4koGwkWlcGzs='); -- ¿Pregunta N° 11?
INSERT INTO preguntas (id, texto) VALUES (12, 'xliR5kIQruSnBE4QSUc8qcseKpV0vyrWTTKfwxqq7UY='); -- ¿Pregunta N° 12?
INSERT INTO preguntas (id, texto) VALUES (13, 'xliR5kIQruSnBE4QSUc8qZdf8TuXv+WPLEdeAjL5JeY='); -- ¿Pregunta N° 13?
INSERT INTO preguntas (id, texto) VALUES (14, 'xliR5kIQruSnBE4QSUc8qbp6/vhMBlZSzvf3Lge1/Fg='); -- ¿Pregunta N° 14?
INSERT INTO preguntas (id, texto) VALUES (15, 'xliR5kIQruSnBE4QSUc8qbWGrl1pZMSUrP/w8d1DzIg='); -- ¿Pregunta N° 15?
INSERT INTO preguntas (id, texto) VALUES (16, 'xliR5kIQruSnBE4QSUc8qSuvG3KcQ8Zsqrf5hjorNwc='); -- ¿Pregunta N° 16?
INSERT INTO preguntas (id, texto) VALUES (17, 'xliR5kIQruSnBE4QSUc8qfXomjymiMDkg2J4msTCOjU='); -- ¿Pregunta N° 17?
INSERT INTO preguntas (id, texto) VALUES (18, 'xliR5kIQruSnBE4QSUc8qY5zorLhKTHDOBwEYKeE3Jo='); -- ¿Pregunta N° 18?
INSERT INTO preguntas (id, texto) VALUES (19, 'xliR5kIQruSnBE4QSUc8qUQzHopWHRGC3+xKlhg5P0M='); -- ¿Pregunta N° 19?
INSERT INTO preguntas (id, texto) VALUES (20, 't4209ft/O745S7d3uGCFf25YDnuCE6a6KkaD9lsi8LA='); -- ¿Pregunta N° 20?

-- Imágenes de seguridad (AES encriptadas)
INSERT INTO imagenes_seguridad (id, nombre_imagen) VALUES (1, '9DjmM4sdO2B2qmMNm6AKaA=='); -- candado.png
INSERT INTO imagenes_seguridad (id, nombre_imagen) VALUES (2, 'goBNmUrjSx632YC+lGqR1g=='); -- estrella.png
INSERT INTO imagenes_seguridad (id, nombre_imagen) VALUES (3, 'nzTGzZTESbTBJlSDUboMPQ=='); -- llave.png
INSERT INTO imagenes_seguridad (id, nombre_imagen) VALUES (4, 'P7LDQHYUe8vNOkn90p9QYg=='); -- escudo.png
INSERT INTO imagenes_seguridad (id, nombre_imagen) VALUES (5, 'gSBAu5zo87iFieF2p/Eb2w=='); -- huella.png
INSERT INTO imagenes_seguridad (id, nombre_imagen) VALUES (6, '0SaA9WmRVk8lme6yNDnuFQ=='); -- img.png

-- Usuarios con username, password y datos de cuenta cifrados con AES
INSERT INTO usuarios (id, username, password, imagen_id, tipo_cliente, tipo_cuenta, numero_cuenta, saldo_disponible) VALUES (1, 'NrzvXXJ9iWYn0LtzIeK7DQ==', 'nnk5VT5ZD/VQbVbqLHwIRg==', 1, 'sMoGb5A1ClIBdWd3cIV1cg==', 'ArIc1ZV3dEjwgj4qB+OZgw==', 'KDrfcaxKbhwIg9cKIzP+mw==', 'dC28EH+4Ke6KiNxIoYZKqQ=='); -- TITULAR / CUENTA ACTIVA / 2901788669 / 40.72
INSERT INTO usuarios (id, username, password, imagen_id, tipo_cliente, tipo_cuenta, numero_cuenta, saldo_disponible) VALUES (2, 'PGTbTS6QKdsvqq9hBxIk+w==', 'iMy5c5ywYB4amOC25mZDPA==', 2, 'sMoGb5A1ClIBdWd3cIV1cg==', 'ArIc1ZV3dEjwgj4qB+OZgw==', 'oCQsP4cBC+aKUSsaonCbxA==', 'YXq5OwQ08jX3E2pyPycwYw=='); -- TITULAR / CUENTA ACTIVA / 2901788670 / 125.50
INSERT INTO usuarios (id, username, password, imagen_id, tipo_cliente, tipo_cuenta, numero_cuenta, saldo_disponible) VALUES (3, 'CvUv3O+fK4TsbocfuMXFew==', 'a5So66gkqGyahECIb9B05w==', 3, 'sMoGb5A1ClIBdWd3cIV1cg==', 'wipzYPPD61uzlfaX2tZS5g==', 'T6xaTCLtuThQMPztEUhdSA==', 'CP6GwSHnu6ru4427TLk3oA=='); -- TITULAR / CUENTA PASIVA / 2901788671 / 999.99
INSERT INTO usuarios (id, username, password, imagen_id, tipo_cliente, tipo_cuenta, numero_cuenta, saldo_disponible) VALUES (4, 'ut5FYYa02ZAHwUFAoBnz4g==', 's7ZURLzayNh0Q8svmO9YCQ==', 4, 'zAOJW4Y5qJY6dzhs19A6KA==', 'ArIc1ZV3dEjwgj4qB+OZgw==', 'Yk/RKNEqCJ3mKQvJt5P8bg==', 'FPuU3GVmHdBa2TEq5IvJIg=='); -- BENEFICIARIO / CUENTA ACTIVA / 2901788672 / 12.30
INSERT INTO usuarios (id, username, password, imagen_id, tipo_cliente, tipo_cuenta, numero_cuenta, saldo_disponible) VALUES (5, 'TYKLf/X6+D0nPx1XxKtZxw==', 'BV1EVvSdZMk5CNGWa/8HIA==', 5, 'sMoGb5A1ClIBdWd3cIV1cg==', 'iv3YT9k9V3g+5YBQDhdMsmCjxmKWPpzKnEKGy3vkZNE=', 'r5/0Z/PjMxp7mBDp/WwyiA==', 'JDHi1T+rnJ9ynLMxUiDgiw=='); -- TITULAR / CUENTA DE AHORROS / 2901788673 / 500.00

-- Respuestas
-- Respuestas para usuario 1
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (1, 1, 1, 'HxylHFM4CJmAdbDX9chlng=='); -- respuesta1_u1
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (2, 1, 2, '0/YA4fIP3SNsW7GSmYSEjw=='); -- respuesta2_u1
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (3, 1, 3, 'C6pqfQrr3/NH66J1yc3eVg=='); -- respuesta3_u1
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (4, 1, 4, 'jFEnF4dFAsEjnoEqDElFUA=='); -- respuesta4_u1
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (5, 1, 5, 'wo7HTKi0ltAhGKAZGTGfpQ=='); -- respuesta5_u1

-- usuario 2
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (6, 2, 6, '0RnOIsqjEtKvHZZE+ON3sQ=='); -- respuesta1_u2
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (7, 2, 7, '5fLzR5zFHoRg0Mc5m5QOZg=='); -- respuesta2_u2
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (8, 2, 8, '9s1mcQuopPaHt4ip/YKMrg=='); -- respuesta3_u2
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (9, 2, 9, '77Y33MXsQm9ihFSl2H92xQ=='); -- respuesta4_u2
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (10, 2, 10, '7WTOsUYGoRTzrUGaXDdXow=='); -- respuesta5_u2

-- usuario 3
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (11, 3, 11, 'qdE2N9V6EZJfS6qCe79dpQ=='); -- respuesta1_u3
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (12, 3, 12, 'ZRiOU3Ej1yRn6pe7b6Rz3g=='); -- respuesta2_u3
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (13, 3, 13, '1y0z+9OVWKrMBkFgrHe1ew=='); -- respuesta3_u3
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (14, 3, 14, 'xq5fWFaFQZMPgaJJPcZD/A=='); -- respuesta4_u3
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (15, 3, 15, 'XjG3PDYmQQR4MoNv6iV6ew=='); -- respuesta5_u3

-- usuario 4
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (16, 4, 16, 'gq7X74c1Tb2zY9OzXWWNQg=='); -- respuesta1_u4
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (17, 4, 17, 'Mn4gtK2PTNhRpDxjlEMk5g=='); -- respuesta2_u4
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (18, 4, 18, 'z1SkTvJDv6qzqVqgzNcIfA=='); -- respuesta3_u4
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (19, 4, 19, 'br6lbVnnfn4CeCNMg7OKAg=='); -- respuesta4_u4
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (20, 4, 20, 'WDRQNLPRnM9V6nEj/OBy4w=='); -- respuesta5_u4

-- usuario 5
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (21, 5, 1, 'VikzOaIEI7VuKcA5JooW5A=='); -- respuesta1_u5
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (22, 5, 2, 'NCEdy47z64YBPNyf2XyEmA=='); -- respuesta2_u5
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (23, 5, 3, 'TWuOBFYOkBskVPmms2sriA=='); -- respuesta3_u5
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (24, 5, 4, 'dU2sTI8/0d7Q7hGMFG3EkQ=='); -- respuesta4_u5
INSERT INTO respuestas (id, usuario_id, pregunta_id, respuesta_encriptada) VALUES (25, 5, 5, 'Gi7uDM7OR5AbUl+x7AXkAg=='); -- respuesta5_u5

