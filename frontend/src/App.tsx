import NavBar from "components/NavBar";
import Footer from "components/NavBar/Footer";
import DataTable from "components/DataTable";

function App() {
  return (

    // A função só pode ter um retorno, mas com a tag '<> </> pode-se adicionar outros'
    <>
    <NavBar />
    <div className="container">
        <h1 className="text-primary">Hello world</h1>
        <DataTable />       
    </div>
    <Footer />
    </>
  );
}

export default App;
