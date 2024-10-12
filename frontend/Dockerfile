FROM node:22-alpine3.18 AS start1
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build

FROM nginx:alpine

COPY --from=start1 /app/nginx.conf/ /etc/nginx/
COPY --from=start1 /app/dist/frontend/browser/ /usr/share/nginx/html/

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]

