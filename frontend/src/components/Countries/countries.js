import React from "react"; //ne go zaboravaj ova

const countries = (props) => {
//proes e objekt a nie sakame da pristapime do svojstvoto authors
    return(
        <div className={"container mm-4 mt-5"}>
            <div className={"row"}>
                <div className={"row"}>
                    <table className={"table table-striped"}>
                        <thead>
                        <th scope={"col"}>Name</th>
                        <th scope={"col"}>Continent</th>
                        </thead>
                        <tbody>
                        {props.countries.map((term) => {
                            return(
                                <tr>
                                    <td>{term.name}</td>
                                    <td>{term.continent}</td>
                                </tr>
                            );
                        })}
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    );
}
//prime properties

export default countries;