FROM microsoft/dotnet:2.1-sdk as build-phase
WORKDIR /sum-server

COPY . ./

WORKDIR DotNetServer

RUN dotnet restore
RUN dotnet publish -c Release -o build

FROM microsoft/dotnet:2.1-runtime
WORKDIR /sum-server

COPY --from=build-phase /sum-server/DotNetServer/build .

ENTRYPOINT ["dotnet", "DotNetServer.dll"]

EXPOSE 7777