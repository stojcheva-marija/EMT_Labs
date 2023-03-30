import React from "react"; //ne go zaboravaj ova

const authors = (props) => {
//proes e objekt a nie sakame da pristapime do svojstvoto authors
    return(
        <div className={"container mm-4 mt-5"}>
            <div className={"row"}>
                <div className={"row"}>
                    <table className={"table table-striped"}>
                        <thead>
                        <th scope={"col"}>Name</th>
                        <th scope={"col"}>Surname</th>
                        <th scope={"col"}>Country</th>
                        </thead>
                        <tbody>
                        {props.authors.map((term) => {
                            return(
                                <tr>
                                    <td>{term.name}</td>
                                    <td>{term.surname}</td>
                                    <td>{term.country.name}</td>
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

export default authors;